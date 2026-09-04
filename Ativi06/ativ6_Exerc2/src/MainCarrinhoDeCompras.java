public class MainCarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Testando a 1ª versão (Soma de dois preços)
        // Ex: Produto A de R$ 50,00 e Produto B de R$ 30,00
        double total1 = carrinho.calcularTotal(50.00, 30.00);
        System.out.printf("1. Total (Dois preços): R$ %.2f\n", total1);

        // Testando a 2ª versão (Dois preços + desconto percentual)
        // Ex: Produto A de R$ 100,00, Produto B de R$ 50,00 com 10% de desconto
        double total2 = carrinho.calcularTotal(100.00, 50.00, 10.0);
        System.out.printf("2. Total (Com desconto de 10%%): R$ %.2f\n", total2);

        // Testando a 3ª versão (Varargs - quantidade indefinida de preços)
        // Ex: Vários produtos adicionados ao carrinho de uma só vez
        double total3 = carrinho.calcularTotal(15.50, 42.00, 10.00, 120.00, 5.99);
        System.out.printf("3. Total (Com vários produtos usando varargs): R$ %.2f\n", total3);
    }
}