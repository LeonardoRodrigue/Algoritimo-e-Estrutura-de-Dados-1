package Etapa3;

import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        int primeiros[] = new int[10];
        int ultimos[] = new int[10];
        int soma[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 20 numeros!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            primeiros[i] = numeros[i];
            ultimos[i] = numeros[i + 10];
        }
        for (int i = 0; i < 10; i++){
            soma[i] = primeiros[i] + ultimos[i];
            System.out.print(soma[i]+" ");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes