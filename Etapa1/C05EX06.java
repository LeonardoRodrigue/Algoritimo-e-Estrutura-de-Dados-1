package Etapa1;

import java.util.Scanner;

public class C05EX06 {
    public static void main(String[] args) {
        double A, B, C, x, y, R, P, distancia;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A da reta R: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor B da reta R: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor C da reta R: ");
        C = sc.nextDouble();
        System.out.print("Digite o valor X da reta P: ");
        x = sc.nextDouble();
        System.out.print("Digite o valor Y da reta P: ");
        y= sc.nextDouble();

        R = (A * x) + (B * y) + C;
        //P = (x,y);
        distancia = R / Math.sqrt(Math.pow(A,2) + Math.pow(B,2));

        System.out.print("Distancia: " + distancia);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes