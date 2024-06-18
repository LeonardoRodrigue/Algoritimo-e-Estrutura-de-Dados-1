package Etapa3;

import java.util.Scanner;

public class C12EX02 {
    public static void main(String[] args) {
        int numeros[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros para saber quais são maiores que 5 e menores que 10!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 5 && numeros[i] < 10){
                System.out.print(numeros[i]+" ");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes