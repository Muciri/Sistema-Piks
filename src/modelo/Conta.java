/**
 * SI - POO - Prof. Fausto Ayres
 *
 */

package modelo;

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

    public Conta(int id, String chavePiks, double saldo){
        this.id = id;
        this.chavePiks = chavePiks;
        this.saldo = saldo;
    }

    public Conta(int id, String chavePiks){
        this.id = id;
        this.chavePiks = chavePiks;
        this.saldo = 0;
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

    public void setChavePiks(String chave) {
        this.chavePiks = chave;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) throws Exception {
        if(valor < 0) {
            throw new Exception("Valor tem que ser maior que zero");
        }
        this.saldo = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Lancamento> getLancamentos(){
        return this.lancamentos;
    }

    //métodos gerais
    public void creditar(double valor) throws Exception {
        this.saldo += valor;
        this.adicionar(new Lancamento(valor, "+"));
    }

    public void debitar(double valor) throws Exception{
        if(valor > this.saldo){
            throw new Exception("valor debitado não pode ser maior que o saldo");
        }

        this.saldo -= valor;
        this.adicionar(new Lancamento(valor, "-"));
    }

    public void adicionar(Lancamento lanc) {
        this.lancamentos.add(lanc);
    }

    public void transferir(Conta destino, double valor) throws Exception{
        if(this.equals(destino)){
            throw new Exception("As contas devem ser diferentes numa transferência");
        }

        this.debitar(valor);
        destino.creditar(valor);
    }
}