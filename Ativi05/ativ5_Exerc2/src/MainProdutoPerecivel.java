public class MainProdutoPerecivel {
    public static void main(String[] args) {
        ProdutoPerecivel leite = new ProdutoPerecivel("001", "Leite", 5.0, "2025-05-01");
        System.out.println("Produto: " + leite.getNome());
        System.out.println("Vencido em 2025-07-01? " + leite.estaVencido("2025-07-01"));
    }
}
