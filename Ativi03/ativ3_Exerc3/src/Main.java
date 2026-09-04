public class Main {
    public static void main(String[] args) {
        // Criando um cliente válido
        ClienteVip cliente1 = new ClienteVip("Ana Souza", "123.456.789-00", 15000.00);
        cliente1.exibirCliente();

        System.out.println("\n--- Testando limite inválido ---");
        // Tentando definir um limite abaixo de R$ 1.000,00
        cliente1.setLimiteCredito(500.00);
    }
}
