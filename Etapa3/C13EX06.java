package Etapa3;

import java.util.Scanner;

public class C13EX06 {
    public static void main(String[] args) {
        String familia, nome;
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um sobrenome de familia: ");
        familia = sc.nextLine();

        for (int x = 0; x <= 100; x++){
            System.out.print("Digite o nome: ");
            nome = sc.nextLine();

            String sobrenome[] = nome.split(" ");

            for (int i = 0; i < sobrenome.length; i++){
                if (i == sobrenome.length - 1){
                    if (sobrenome[i].equalsIgnoreCase(familia)){
                        cont++;
                    }
                }
            }
        }
        System.out.println(cont+" pessoas fazem parte da familia "+familia);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes