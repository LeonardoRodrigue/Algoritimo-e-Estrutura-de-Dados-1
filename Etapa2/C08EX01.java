package Etapa2;

import java.util.Scanner;

public class C08EX01 {
    public static void main(String[] args) {
        double pi = 3.1416, area, raio;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite o raio para saber a área: ");
            raio = sc.nextDouble();
            area = pi * Math.pow(raio, 2);
            System.out.println("A área é = "+ area);
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes