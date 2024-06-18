package Etapa3;

import java.util.Scanner;

public class C12EX20 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int soma = 0, cont = 0;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Os numeros maiores que o ultimo numero digitado são: ");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > numeros[numeros.length - 1]){
                System.out.print(numeros[i] + " ");
                soma += numeros[i];
                cont++;
            }
        }
        media = (double) soma / cont;
        System.out.println("\nA media dos numeros é igual a "+media);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes