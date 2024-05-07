package Etapa2;

import java.util.Scanner;

public class C10EX03 {
    public static void main(String[] args) {
        double angulo, raio, area, pi = 3.1416;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do angulo a ser utilizado: ");
        angulo = sc.nextDouble();

        do {
            System.out.print("Digite o valor do raio: ");
            raio = sc.nextDouble();
            if (raio == -1){
                break;
            }
            area = (angulo * pi * Math.pow(raio,2)) / 360;
            System.out.println("O valor da área do setor circular é = "+area);
        } while (raio != -1);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes