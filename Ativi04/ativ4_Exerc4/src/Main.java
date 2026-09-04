public class Main {
    public static void main(String[] args) {
        // Testando o 1º construtor (sem parâmetros)
        ClienteVarejo cliente1 = new ClienteVarejo();
        System.out.println("Cliente 1 (Padrão/Vazio):");
        cliente1.exibirCliente();

        // Testando o 2º construtor (nome e cpf)
        ClienteVarejo cliente2 = new ClienteVarejo("Maria Oliveira", "123.456.789-99");
        System.out.println("Cliente 2 (Com dados):");
        cliente2.exibirCliente();
    }
}