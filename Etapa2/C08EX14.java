package Etapa2;

import java.util.Scanner;

public class C08EX14 {
    public static void main(String[] args) {
        int numero;
        String simbolo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 20: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite um simbolo qualquer: ");
        simbolo = sc.nextLine();

        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= numero; j++){
                System.out.print(" "+simbolo);
            }
            System.out.println();
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes