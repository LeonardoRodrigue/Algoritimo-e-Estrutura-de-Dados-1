package Etapa3;

import java.util.Scanner;

public class C13EX07 {
    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();

            if (nome.equalsIgnoreCase("X")){
                break;
            }

            String sobrenome[] = nome.split(" ");

            for (int i = 0; i < sobrenome.length; i++){
                if (i == sobrenome.length - 1){
                    System.out.println("Familia "+sobrenome[i]);
                }
            }
        } while (!nome.equalsIgnoreCase("X"));
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes