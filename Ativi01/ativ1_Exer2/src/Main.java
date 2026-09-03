//Exercicio 2 - Crie um programa que verifique se o número digitado pelo usuário é par ou ímpar.


import java.util.Scanner;


public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número desejado: ");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
        System.out.println("Par");
    } else {
        System.out.println("Ímpar");
    }
}


