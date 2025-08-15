import java.util.TreeMap;

public class Repositorio {
    //atributos
    private static TreeMap<String,Conta> contasPIKS = new TreeMap<String,Conta>();
    private static TreeMap<Integer, Cliente> clientesCPF = new TreeMap<Integer, Cliente>();

    //construtor privado, por ser uma classe utilitária
    private Repositorio(){};

    //bloco estático de inicialização
    static {
        lerObjetos();
    }

    //getters e setters

    //métodos gerais
    public static void adicionarConta(Conta conta) {
        contasPIKS.put(conta.getChavePiks(), conta);
    }

    public static void removerConta(Conta conta) {
        contasPIKS.remove(conta.getChavePiks());
    }

    public static Conta localizarConta(String chavePiks){
        for(Conta conta: contasPIKS.values()) {
            if(conta.getChavePiks().equals(chavePiks)){
                return conta;
            }
        }

        return null; //se a conta não for encontrada, retorna null
    }

    public static void adicionarCliente(Cliente cliente){
        //clientesCPF.put(cliente.getCPF(), cliente); //descomentar esta linha quando implementar a classe cliente e seus metodos
    }

    public static void removerCliente(Cliente cliente){
        //clientesCPF.remove(cliente.getCPF()); //descomentar esta linha quando implementar a classe cliente e seus metodos
    }

    public static void lerObjetos(){
        //TO DO
    }
}