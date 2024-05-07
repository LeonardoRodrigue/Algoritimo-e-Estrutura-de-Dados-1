package Etapa1;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para saber se é divisivel simultaneamente por 5 e 7: ");
        numero = sc.nextInt();

        if ((numero % 5) == 0 && (numero % 7) == 0) {
            System.out.println("Este numero é divisivel simultaneamente por 5 e 7!");
        } else {
            System.out.println("Este numero não é divisivel simultaneamente por 5 e 7!");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes