public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", "12345-6", 500.00);
        conta.exibirExtrato();
        conta.depositar(200.00);
        conta.sacar(100.00);
        conta.exibirExtrato();
    }
}