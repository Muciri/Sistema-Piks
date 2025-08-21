import java.time.LocalDateTime;

public class Lancamento {
    //atributos
	private LocalDateTime dataHora;
    private double valor;
    private String tipo;
    
    //construtor
    public Lancamento(LocalDateTime dataHora, double valor, String tipo) throws Exception {
    	if(!tipo.equals("+") && !tipo.equals("-")) {
    		throw new Exception("Tipo deve ser '+' (crédito) ou '-' (débito)");
    	}
    	this.dataHora = dataHora;
    	this.valor = valor;
    	this.tipo = tipo;
    }

	public Lancamento(double valor, String tipo) throws Exception {
		if(!tipo.equals("+") && !tipo.equals("-")) {
			throw new Exception("Tipo deve ser '+' (crédito) ou '-' (débito)");
		}
		this.dataHora = LocalDateTime.now();
		this.valor = valor;
		this.tipo = tipo;
	}
    //toString
	@Override
	public String toString() {
		return "Lancamento [dataHora=" + dataHora + ", valor=" + valor + ", tipo=" + tipo + "]";
	}

	//getters e setters
	public LocalDateTime getDatahora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
