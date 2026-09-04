public class Main {
    public static void main(String[] args) {
        // Criando um item válido
        ItemCarrinho item1 = new ItemCarrinho("Notebook", 2, 3500.00);
        item1.exibirItem();

        // Testando validações inválidas
        System.out.println("--- Testando dados inválidos ---");
        ItemCarrinho item2 = new ItemCarrinho("Mouse", 0, -50.00);
    }
}