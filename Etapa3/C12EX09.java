package Etapa3;

import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        for (int i = 0; i < numeros.length; i++) {
            if (soma % numeros[i] == 0){
                System.out.print(numeros[i]+" ");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes