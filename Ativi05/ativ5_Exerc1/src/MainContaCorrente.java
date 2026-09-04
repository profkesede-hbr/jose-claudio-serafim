public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Carlos", "12345-6", 1000.0, 500.0);
        System.out.println("Saldo inicial: R$ " + cc.getSaldo());

        boolean saque = cc.sacarComChequeEspecial(1200.0);
        System.out.println("Saque de R$1200: " + (saque ? "Autorizado" : "Negado"));
        System.out.println("Saldo atual: R$ " + cc.getSaldo());
    }
}
