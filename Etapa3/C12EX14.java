package Etapa3;

import java.util.Scanner;

public class C12EX14 {
    public static void main(String[] args) {
        int bilhetes[] = new int[10];
        int bilhete_premiado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros dos bilhetes que foram comprados");
        for (int i = 0; i < bilhetes.length; i++){
            System.out.print("Bilhete: ");
            bilhetes[i] = sc.nextInt();
        }

        System.out.print("Digite o numero do bilhete premiado: ");
        bilhete_premiado = sc.nextInt();

        for (int i = 0; i < bilhetes.length; i++){
            if (bilhetes[i] == bilhete_premiado){
                System.out.println("Você tirou o bilhete premiado, PARABENS!");
                break;
            } else if (i == (bilhetes.length - 1) && bilhetes[i] != bilhete_premiado){
                System.out.println("Não tirou o bilhete premiado.");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes