public class Main {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto = new Produto("Teclado Mecânico", 250.00, 10);
        produto.exibirProduto();

        produto.adicionarEstoque(5);
        produto.removerEstoque(3);
        produto.removerEstoque(20); // Erro (estoque insuficiente)

        produto.exibirProduto();
    }
}