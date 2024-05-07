package Etapa1;

import java.util.Scanner;

public class C05EX10 {
    public static void main(String[] args) {
        int numero, n1, n2, n3, n4, n5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        numero = sc.nextInt();

        n1 = numero / 10000;
        n2 = numero / 1000 % 10;
        n3 = numero / 100 % 10;
        n4 = numero / 10 % 10;
        n5 = numero % 10;

        System.out.print(n1 + "\n" + n2 + "\n" + n3 + "\n" +n4 + "\n" + n5);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes