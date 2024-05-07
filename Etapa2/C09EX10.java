package Etapa2;

import java.util.Scanner;

public class C09EX10 {
    public static void main(String[] args) {
        double A, B, C, D, E, F;
        double num_A, den_A, num_B, den_B, num_C, den_C, num_D, den_D, num_E, den_E, num_F, den_F;
        double serie_A = 0, serie_B = 0, serie_C = 0, serie_D = 0, serie_E = 0, serie_F = 0;

        for (int i = 1; i <= 100; i++) {
            num_A = i;
            den_A = Math.sqrt(i * 2);
            serie_A += num_A / den_A;

            num_B = i * 2;
            den_B = i * 3;
            serie_B += num_B / den_B;

            num_C = (i * 2) - 1;
            den_C = i * 2;
            serie_C += num_C / den_C;

            num_D = i + (i - 1);
            den_D = Math.pow(i,2);
            serie_D += num_D / den_D;

            num_E = i;
            den_E = 3 * (i * 2);
            serie_E += num_E / den_E;

            num_F = Math.pow(i,2);
            den_F = Math.pow((i * 2), 2);
            serie_F += num_F / den_F;
        }

        A = serie_A;
        B = 1 + Math.sqrt(serie_B);
        C = Math.pow(serie_C, 2) / 3;
        D = serie_D;
        E = serie_E;
        F = serie_F;

        System.out.println("Valor da Série A = "+A);
        System.out.println("Valor da Série B = "+B);
        System.out.println("Valor da Série C = "+C);
        System.out.println("Valor da Série D = "+D);
        System.out.println("Valor da Série E = "+E);
        System.out.println("Valor da Série F = "+F);
    }
}

// Leonardo Rodrigues Reis Lopes