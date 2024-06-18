package Etapa3;

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {
        int numeros[] = new int[20];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i+=2){
            System.out.print(numeros[i]+" ");
        }

        for (int i = 1; i < numeros.length; i+=2){
            System.out.print(numeros[i]+" ");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes