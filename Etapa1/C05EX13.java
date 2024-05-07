package Etapa1;

import java.util.Scanner;

public class C05EX13 {
    public static void main(String[] args) {
        int numero, n1, n2, n3, n4;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 4 digitos para saber se é ou não um palíndromo: ");
        numero = sc.nextInt();

        n1 = numero / 1000;
        n2 = numero / 100 % 10;
        n3 = numero / 10 % 10;
        n4 = numero % 10;

        if (n1 == n4 && n2 == n3){
            System.out.print("Este numero é um palíndromo!");
        } else {
            System.out.print("Não é um palíndromo!");
        }

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes