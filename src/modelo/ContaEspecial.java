/**
 * SI - POO - Prof. Fausto Ayres
 *
 */
package modelo;

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

    public ContaEspecial(int id, String chavePiks, double saldo, double limite){
        super(id, chavePiks, saldo);
        this.limite = limite;
    }

    public ContaEspecial(int id, String chavePiks, double limite) {
        super(id, chavePiks);
        this.limite = limite;
    }

    //getters e setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    //toString
    @Override
    public String toString(){
        return "{id: " +this.id + ", chavepiks: " + this.chavePiks + ", saldo: " + this.saldo + ", limite: " + this.limite + "}";
    }

    //método
    @Override
    public void debitar(double valor) throws Exception{
        if(valor > (this.saldo + this.limite) ){
            throw new Exception("esta transferência excede o limite");
        }

        this.saldo -= valor;
        this.adicionar(new Lancamento(valor, "-"));
    }
}