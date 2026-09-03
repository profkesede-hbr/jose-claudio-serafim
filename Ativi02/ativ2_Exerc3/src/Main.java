import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a forma de pagamento (DÉBITO, CRÉDITO ou PIX): ");
        String forma = scanner.next();

        double valorFinal = calcularTotal(forma, valor);

        if (valorFinal == -1) {
            System.out.println("Erro: Forma de pagamento inválida!");
        } else {
            System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);
        }

        scanner.close();
    }


    public static double calcularTotal(String formaPagamento, double valor) {
        switch (formaPagamento.toUpperCase()) {
            case "DÉBITO":
            case "PIX":
                return valor; // Sem alteração para Débito ou PIX
            case "CRÉDITO":
                return valor * 1.02; // Acréscimo de 2%
            default:
                return -1; // Opção inválida
        }
    }
}