public class Main {
    public static void main(String[] args) {
        // Testando o 1º construtor (sem parâmetros)
        Produto p1 = new Produto();
        System.out.println("Produto 1 (Padrão):");
        p1.exibirProduto();

        // Testando o 2º construtor (código e nome)
        Produto p2 = new Produto("P001", "Mouse Gamer");
        System.out.println("Produto 2 (Apenas código e nome):");
        p2.exibirProduto();

        // Testando o 3º construtor (todos os atributos)
        Produto p3 = new Produto("P002", "Teclado Mecânico", 250.00);
        System.out.println("Produto 3 (Com preço definido):");
        p3.exibirProduto();
    }
}