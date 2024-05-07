package Etapa1;

import java.util.Scanner;

public class C05EX01 {
    public static void main(String[] args) {
        double x, f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        x = sc.nextDouble();

        f = Math.pow(x,3) + (x * 4) + 10;

        System.out.println("f(x) = " + f);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes