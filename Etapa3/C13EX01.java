package Etapa3;

import java.util.Scanner;

public class C13EX01 {
    public static void main(String[] args) {
        double x1, x2, y1, y2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor referente ao primeiro x: ");
        x1 = sc.nextDouble();
        System.out.print("Digite o valor referente ao primeiro y: ");
        y1 = sc.nextDouble();
        System.out.print("Digite o valor referente ao segundo x: ");
        x2 = sc.nextDouble();
        System.out.print("Digite o valor referente ao segundo y: ");
        y2 = sc.nextDouble();

        System.out.println("A distancia entre estes pontos é = "+distancia_entre_pontos(x1,x2,y1,y2));
        sc.close();
    }

    static double distancia_entre_pontos(double num_x1, double num_x2, double num_y1, double num_y2) {
        double distancia;
        distancia = Math.sqrt(Math.pow(num_x1-num_x2,2) + Math.pow(num_y1-num_y2,2));
        return distancia;
    }
}

// Leonardo Rodrigues Reis Lopes