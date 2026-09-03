//Exercicio 4 - Crie um programa que verifique o quanto um valor se aproxima da média.
// Entre com o valor e a média.


import java.util.Scanner;


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor desejado: ");
    double valor = sc.nextDouble();

    System.out.print("Digite a media desejada: ");
    double media = sc.nextDouble();

    double diferenca = Math.abs(valor - media);
    System.out.printf("Diferença é de %.2f em relação à média.%n", diferenca);

}