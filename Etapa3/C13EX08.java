package Etapa3;

import java.util.Scanner;

public class C13EX08 {
    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();

            if (nome.equalsIgnoreCase("X")) {
                break;
            }

            String sobrenome[] = nome.split(" ");

            for (int i = sobrenome.length - 1; i >= 0; i--) {
                if (i == sobrenome.length - 1) {
                    System.out.print(sobrenome[i].toUpperCase() + ", ");
                }
            }
            for (int z = 0; z < sobrenome.length - 1; z++){
                System.out.print(sobrenome[z].toUpperCase().charAt(0) + ". ");
            }
            System.out.println();
        } while (!nome.equalsIgnoreCase("X"));

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes