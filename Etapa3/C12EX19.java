package Etapa3;

import java.util.Scanner;

public class C12EX19 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int numeros_inverso[] = new int[10];
        int x = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = numeros.length -1; i > 0; i--){
            numeros_inverso[x] = numeros[i];
            x++;
        }
        for (int i = 0; i < numeros_inverso.length; i++){
            System.out.print(numeros_inverso[i]+" ");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes