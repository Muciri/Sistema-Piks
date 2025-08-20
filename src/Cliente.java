public class Cliente {
   //atributos
	private int cpf;
    private String nome;
    Conta conta;
    
    //construtores
    public Cliente(int cpf, String nome, Conta conta) {
    	this.cpf = cpf;
    	this.nome = nome;
    	this.conta = conta;
    }
    
    public Cliente(int cpf, String nome) {
    	this.cpf = cpf;
    	this.nome = nome;
    }
  
    //toString
    @Override
    public String toString() {
        return "{cpf:" + cpf + ", nome:" + nome + ", contaId:" + conta.getId() + "}";
      }
      
	//getters e setters
    public int getCpf() {
    	return cpf;
    }
    
    public void setCpf(int cpf) {
    	this.cpf = cpf;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public void setConta(Conta conta) {
    	this.conta = conta;
    }
    
    public Conta getConta() {
    	return conta;
    }
}
