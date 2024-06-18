package Etapa3;

import java.util.Scanner;

public class C13EX09 {
    public static void main(String[] args) {
        String frase;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite a frase: ");
            frase = sc.nextLine();

            if (frase.equalsIgnoreCase("X")) {
                break;
            }

            String palavra[] = frase.split(" ");

            for (int i = 0; i < palavra.length; i++){
                System.out.print(palavra[i].toUpperCase().charAt(0) + palavra[i].substring(1)+" ");
            }
            System.out.println();

        } while (!frase.equalsIgnoreCase("X"));

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes