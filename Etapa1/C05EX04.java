package Etapa1;

import java.util.Scanner;

public class C05EX04 {
    public static void main(String[] args) {

        double x1, y1, x2, y2, distancia;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o X do primeiro ponto --> ");
        x1 = sc.nextDouble();
        System.out.print("Digite o Y do primeiro ponto --> ");
        y1 = sc.nextDouble();
        System.out.print("Digite o X do segundo ponto --> ");
        x2 = sc.nextDouble();
        System.out.print("Digite o Y do segundo ponto --> ");
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));

        System.out.print("Distancia = " + distancia);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes