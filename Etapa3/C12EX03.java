package Etapa3;

import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int quadrados[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros para saber o quadrado destes valores!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            quadrados[i] = (int) Math.pow(numeros[i],2);
            System.out.print(quadrados[i]+" ");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes