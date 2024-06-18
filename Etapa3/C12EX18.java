package Etapa3;

import java.util.Scanner;

public class C12EX18 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        double num_real;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite um numero real: ");
        num_real = sc.nextDouble();

        for (int i = 0; i < numeros.length; i++){
            System.out.print((numeros[i] * num_real)+" ");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes