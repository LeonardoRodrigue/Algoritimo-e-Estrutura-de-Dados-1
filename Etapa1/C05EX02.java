package Etapa1;

import java.util.Scanner;
public class C05EX02 {
    public static void main(String[] args) {
        double raio, area, volume;
        double pi = 3.1416;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        area = (pi * (Math.pow(raio,2) * 4));
        volume = ((pi * Math.pow(raio,3)) * 1.33333333);

        System.out.print("Raio = " + raio + " Área = " + area + " e Volume = " + volume);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes