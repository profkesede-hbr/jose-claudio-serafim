public class ContaBancaria {
    // Atributos privados
    private String titular;
    private String numeroConta;
    private double saldo;

    // 1. Construtor sem parâmetros (padrão)
    public ContaBancaria() {
        this.titular = "";
        this.numeroConta = "";
        this.saldo = 0.0;
    }

    // 2. Construtor que recebe titular e numeroConta (saldo inicia com zero)
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Opcional, pois double já inicia com 0.0 por padrão, mas é bom deixar explícito
    }

    // 3. Construtor que recebe todos os três atributos
    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // --- Getters e Setters ---

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método auxiliar para exibir os dados da conta
    public void exibirConta() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
        System.out.println("--------------------------------");
    }
}