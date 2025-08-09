public class ContaEspecial extends Conta{
    //atributo
    private double limite;

    //construtores
    public ContaEspecial(int id, String chavePiks, double saldo, Cliente cliente, double limite) {
        super(id, chavePiks, saldo, cliente);
        this.limite = limite;
    }

    public ContaEspecial(int id, String chavePiks, Cliente cliente, double limite) {
        super(id, chavePiks, cliente);
        this.limite = limite;
    }

    public ContaEspecial(int id, Cliente cliente, double limite) {
        super(id, cliente);
        this.limite = limite;
    }

    //método
    @Override
    public void debitar(double valor) throws Exception{
        if(valor > (this.saldo + this.limite) ){
            throw new Exception("esta transferência excede o limite");
        }

        this.saldo -= valor;
        //this.lancamentos.add(new Lancamento(valor, "-")); //descomentar esta linha quando implementar a classe Lancamento, e seu construtor
    }
}