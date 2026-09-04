public class MainClienteVip {
    public static void main(String[] args) {
        ClienteVip vip = new ClienteVip("Lucas", "111.222.333-44", 3, 10.0);
        double precoOriginal = 200.0;
        double precoFinal = vip.calcularPrecoComDesconto(precoOriginal);

        System.out.println("Cliente: " + vip.getNome());
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Preço com desconto: R$" + precoFinal);
    }
}


