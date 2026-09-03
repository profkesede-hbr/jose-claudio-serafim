
//Exercicio 1 - Crie um programa que verifique se o número digitado pelo usuário é positivo, negativo ou zero.

import java.util.Scanner;


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Digite o número desejado:");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        }else {
            System.out.println("Zero");
        }
    }
