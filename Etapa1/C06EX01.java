package Etapa1;

import java.util.Scanner;

public class C06EX01 {
    public static void main(String[] args) {
        double fx, x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        if (x == 4) {
            fx = 0;
        } else {
            if (x < 4){
                fx = ((x * 5) + 3) / Math.sqrt(16 - Math.pow(x,2));
            } else {
                fx = ((x * 5) + 3) / Math.sqrt(Math.pow(x,2) - 16);
            }
        }
        System.out.print("F(x) = " + fx);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes