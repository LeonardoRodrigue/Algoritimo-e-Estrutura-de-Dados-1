package Etapa2;

import java.util.Scanner;

public class C11EX12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 9:");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1 && numero <= 9) {
            for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Número fora do intervalo permitido.");
        }
        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes