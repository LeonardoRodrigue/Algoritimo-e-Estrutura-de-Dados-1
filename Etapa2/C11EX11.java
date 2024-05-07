package Etapa2;

import java.util.Scanner;

public class C11EX11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 9:");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1 && numero <= 9) {
            for (int aux = 1; aux <= numero; aux++) {
                for (int aux2 = 1; aux2 <= aux; aux2++) {
                    System.out.print(aux + " ");
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