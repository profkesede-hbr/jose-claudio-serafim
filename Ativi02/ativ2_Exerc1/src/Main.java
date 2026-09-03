import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor total da compra: R$ ");
        double valorDigitado = scanner.nextDouble();


        double valorComDesconto = calcularDesconto(valorDigitado);


        System.out.printf("Valor final com desconto: R$ %.2f%n", valorComDesconto);

        scanner.close();
    }


    public static double calcularDesconto(double valorTotal) {
        double percentualDesconto;

        if (valorTotal <= 100.0) {
            percentualDesconto = 0.05; // 5%
        } else if (valorTotal <= 500.0) {
            percentualDesconto = 0.10; // 10%
        } else {
            percentualDesconto = 0.15; // 15%
        }

        return valorTotal - (valorTotal * percentualDesconto);
    }
}