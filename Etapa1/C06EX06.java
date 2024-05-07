package Etapa1;

import java.util.Scanner;

public class C06EX06 {
    public static void main(String[] args) {

        double A, B, C, delta, x, x1, x2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A para saber as raizes da função F(x): ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B para saber as raizes da função F(x): ");
        B = sc.nextDouble();
        System.out.print("Digite o valor de C para saber as raizes da função F(x): ");
        C = sc.nextDouble();

        delta = Math.pow(B,2) - (4 * A * C);

        if (delta > 0){
            x1 = (-B + Math.sqrt(delta) / (2 * A));
            x2 = (-B - Math.sqrt(delta) / (2 * A));
            System.out.println("Temos duas raízes = " + x1 + " e " + x2);
        } else if (delta == 0) {
            x = -B / ( (2 * A));
            System.out.println("Temos 1 raíz = " + x);
        } else {
            System.out.println("Não temos raizes!");
        }

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes