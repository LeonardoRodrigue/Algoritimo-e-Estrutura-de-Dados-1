package Etapa1;

import java.util.Scanner;
public class C05EX08 {
    public static void main(String[] args) {
        double areaSetor, anguloRadianos, raio, angulo;
        double pi = 3.1416;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo (em graus): ");
        areaSetor = sc.nextDouble();

        System.out.print("Digite o valor do ângulo (em graus): ");
        angulo = sc.nextDouble();

        anguloRadianos = Math.toRadians(angulo);

        raio = Math.sqrt((areaSetor * 180) / (pi * anguloRadianos));

        System.out.println("O valor do raio (R) é: " + raio);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes