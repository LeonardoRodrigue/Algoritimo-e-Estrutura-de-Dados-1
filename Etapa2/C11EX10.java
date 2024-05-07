package Etapa2;

import java.util.Scanner;

public class C11EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero=1;
        System.out.println("Informe um número inteiro entre 1 e 9 para se fazer a repetição:");
        numero = scanner.nextInt();
        if (numero >=1 && numero<=9);
        for (int aux2 = 1; aux2 <= numero; aux2++) {
            for (int aux = 1; aux <= aux2; aux++)
                System.out.print("EMGE");
            System.out.println();

        }
        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes