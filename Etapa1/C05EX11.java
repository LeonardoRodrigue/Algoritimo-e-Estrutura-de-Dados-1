package Etapa1;

import java.util.Scanner;

public class C05EX11 {
    public static void main(String[] args) {
        int numero, n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do cheque: ");
        numero = sc.nextInt();

        n1 = numero / 1000000;
        n2 = numero / 1000 % 1000;
        n3 = numero % 1000;

        System.out.print("Banco = " + n1 + ", Agência = " + n2 + ", Sequencial = " + n3);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes