public class CarrinhoDeCompras {

    // 1. Método que recebe dois preços e retorna a soma simples
    public double calcularTotal(double preco1, double preco2) {
        return preco1 + preco2;
    }

    // 2. Método que recebe dois preços e um valor de desconto percentual
    public double calcularTotal(double preco1, double preco2, double descontoPercentual) {
        double soma = preco1 + preco2;
        // Aplica o desconto sobre a soma (ex: 10% de desconto -> multiplica por (1 - 0.10))
        double valorComDesconto = soma * (1 - (descontoPercentual / 100.0));
        return valorComDesconto;
    }

    // 3. Método que aceita um número indefinido de preços utilizando varargs (double...)
    public double calcularTotal(double... precos) {
        double somaTotal = 0.0;
        // Percorre todos os preços passados no array e acumula na soma
        for (double preco : precos) {
            somaTotal += preco;
        }
        return somaTotal;
    }
}