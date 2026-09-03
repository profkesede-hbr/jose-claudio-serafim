import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int parcelas = scanner.nextInt();

        System.out.println("\n--- Detalhamento das Parcelas ---");
        exibirParcelas(valorTotal, parcelas);

        scanner.close();
    }

    public static void exibirParcelas(double valorTotal, int numeroParcelas) {
        double valorParcela = valorTotal / numeroParcelas;

        for (int i = 1; i <= numeroParcelas; i++) {
            valorParcela *= 1.01; // Aplica 1% de juros compostos a cada mês
            System.out.printf("Parcela %d: R$%.2f%n", i, valorParcela);
        }
    }
}