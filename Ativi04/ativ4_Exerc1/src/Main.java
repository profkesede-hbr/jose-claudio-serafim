public class Main {
    public static void main(String[] args) {
        // Testando o 1º construtor (sem parâmetros)
        ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Conta 1 (Vazia):");
        conta1.exibirConta();

        // Testando o 2º construtor (titular e número da conta)
        ContaBancaria conta2 = new ContaBancaria("Carlos Silva", "12345-6");
        System.out.println("Conta 2 (Apenas titular e número):");
        conta2.exibirConta();

        // Testando o 3º construtor (todos os atributos)
        ContaBancaria conta3 = new ContaBancaria("Ana Souza", "98765-4", 2500.50);
        System.out.println("Conta 3 (Com saldo inicial):");
        conta3.exibirConta();
    }
}