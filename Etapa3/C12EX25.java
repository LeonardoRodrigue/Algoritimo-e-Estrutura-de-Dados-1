package Etapa3;

import java.util.Scanner;

public class C12EX25 {
    public static void main(String[] args) {
        String frase = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();

        String palavras[] = frase.split(" ");

        for (int i=0; i<palavras.length; i++)
            System.out.println(palavras[i]);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes