package Etapa3;

import java.util.Scanner;

public class C13EX10 {
    public static void main(String[] args) {
        String frase;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        frase = sc.nextLine();

        String palavra[] = frase.split("");

        for (int i = 0; i < palavra.length; i++){
            System.out.println(palavra[i].toUpperCase());
        }

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes