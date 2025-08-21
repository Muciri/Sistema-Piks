# Sistema Piks

Um sistema de transferências bancárias feito desenvolvido como segundo projeto da disciplina de POO

# 📖 Documentação das Classes

---

## Classe **Repositorio**

Classe utilitária responsável por armazenar e gerenciar todas as contas (`Conta`) e clientes (`Cliente`) do sistema.

### Atributos

* `private static TreeMap<String, Conta> contasPIKS`
  Estrutura de dados que mapeia a **chave PIKS** para sua respectiva conta.
* `private static TreeMap<Integer, Cliente> clientesCPF`
  Estrutura de dados que mapeia o **CPF** de um cliente para sua instância.

### Métodos

* `public static void adicionarConta(Conta conta)`
  Adiciona uma nova conta ao repositório.

* `public static void removerConta(Conta conta)`
  Remove uma conta existente do repositório.

* `public static Conta localizarConta(String chavePiks)`
  Localiza uma conta através de sua chave PIKS.

* `public static void adicionarCliente(Cliente cliente)`
  Registra um cliente no repositório.

* `public static void removerCliente(Cliente cliente)`
  Remove um cliente existente do repositório.

* `public static Cliente localizarCliente(int cpf)`
  Localiza um cliente pelo CPF.

* `public static ArrayList<Conta> getContas()`
  Retorna a lista de todas as contas cadastradas.

* `public static ArrayList<Cliente> getClientes()`
  Retorna a lista de todos os clientes cadastrados.

* `public static void gravarObjetos()`
  Persiste as informações de contas e clientes em arquivos.

* `public static void lerObjetos()`
  Lê as informações de contas e clientes dos arquivos.

---

## Classe **Conta**

Classe que representa uma conta bancária genérica.

### Atributos

* `private int id`
  Identificador único da conta.

* `private String chavepiks`
  Chave PIKS associada à conta.

* `private double saldo`
  Saldo atual da conta.

* `private Cliente cliente`
  Cliente associado a esta conta.

* `private ArrayList<Lancamento> lancamentos`
  Lista de lançamentos (histórico de transações) da conta.

### Métodos

* `public void creditar(double valor)`
  Adiciona um valor ao saldo da conta.

* `public void debitar(double valor)`
  Subtrai um valor do saldo da conta.

* `public int getId()`
  Retorna o identificador da conta.

* `public String getChavePiks()`
  Retorna a chave PIKS da conta.

* `public double getSaldo()`
  Retorna o saldo da conta.

* `public Cliente getCliente()`
  Retorna o cliente dono da conta.

* `public void setCliente(Cliente cliente)`
  Associa um cliente à conta.

* `public ArrayList<Lancamento> getLancamentos()`
  Retorna a lista de lançamentos da conta.

* `public void setSaldo(double valor)`
  Define o saldo da conta.

* `public void setChavePiks(String chave)`
  Define a chave PIKS da conta.

* `public void adicionar(Lancamento lanc)`
  Registra um lançamento no histórico da conta.

* `public void transferir(double valor, Conta destino)`
  Transfere um valor para outra conta.

---

## Classe **ContaEspecial** (herda de Conta)

Classe que representa uma conta bancária especial, que possui limite de crédito.

### Atributos

* `private double limite`
  Valor do limite adicional de crédito disponível.

### Métodos

* `@Override public void debitar(double valor)`
  Permite débito mesmo que ultrapasse o saldo, respeitando o limite definido.

---

## Classe **Cliente**

Classe que representa o cliente do banco.

### Atributos

* `private int cpf`
  CPF do cliente.

* `private String nome`
  Nome completo do cliente.

* `private Conta conta`
  Conta bancária associada ao cliente.

### Métodos

* `public void setConta(Conta conta)`
  Associa uma conta ao cliente.

* `public Conta getConta()`
  Retorna a conta vinculada ao cliente.

---

## Classe **Lancamento**

Classe que representa uma transação bancária registrada em uma conta.

### Atributos

* `private LocalDateTime datahora`
  Data e hora do lançamento.

* `private double valor`
  Valor da transação.

* `private String tipo`
  Tipo da transação: `"+"` para crédito e `"-"` para débito.