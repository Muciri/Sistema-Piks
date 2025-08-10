import java.util.ArrayList;

public class Conta {
    //atributos
    protected int id;
    protected String chavePiks;
    protected double saldo;
    protected Cliente cliente;
    protected ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();

    //construtores
    public Conta(int id, String chavePiks, double saldo, Cliente cliente){
        this.id = id;
        this.chavePiks = chavePiks;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta(int id, String chavePiks, Cliente cliente){
        this.id = id;
        this.chavePiks = chavePiks;
        this.saldo = 0;
        this.cliente = cliente;
    }

    //toString
    @Override
    public String toString(){
        return "{id: " +this.id + ", chavepiks: " + this.chavePiks + ", saldo: " + this.saldo + "}";
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public String getChavePiks() {
        return chavePiks;
    }

    public double getSaldo() {
        return saldo;
    }

    //métodos gerais
    public void creditar(double valor){
        this.saldo += valor;
        //this.lancamentos.add(new Lancamento(valor, "+")); //descomentar esta linha depois de implementar a classe Lancamento, e seu construtor
    }

    public void debitar(double valor) throws Exception{
        if(valor > this.saldo){
            throw new Exception("valor debitado não pode ser maior que o saldo");
        }
        
        this.saldo -= valor;
        //this.lancamentos.add(new Lancamento(valor, "-")); //descomentar esta linha depois de implementar a classe Lancamento, e seu construtor
    }
}