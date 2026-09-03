import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade disponível em estoque: ");
        int estoque = scanner.nextInt();

        System.out.print("Digite a quantidade desejada pelo cliente: ");
        int desejada = scanner.nextInt();
        
        boolean possuiEstoque = validarEstoque(estoque, desejada);


        if (possuiEstoque) {
            System.out.println("Venda autorizada! Há estoque suficiente.");
        } else {
            System.out.println("Venda recusada! Estoque insuficiente.");
        }

        scanner.close();
    }

    public static boolean validarEstoque(int estoque, int quantidadeDesejada) {
        if (quantidadeDesejada <= 0) {
            return false;
        }

        int contador = 0;
        while (contador < quantidadeDesejada) {
            if (contador >= estoque) {
                return false;
            }
            contador++;
        }

        return true;
    }
}