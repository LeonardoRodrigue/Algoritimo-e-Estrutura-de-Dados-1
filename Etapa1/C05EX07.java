package Etapa1;

import java.util.Scanner;

public class C05EX07 {
    public static void main(String[] args) {
        double fx, x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        fx = Math.sqrt(Math.pow(((x / 4) + 1),2) + (x * 0.2));

        System.out.print("F(x) = " + fx);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes