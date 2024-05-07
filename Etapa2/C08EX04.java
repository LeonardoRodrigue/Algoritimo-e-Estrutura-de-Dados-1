package Etapa2;

import java.util.Scanner;

public class C08EX04 {
    public static void main(String[] args) {
        int cont_maior = 0, cont_menor = 0, idade;
        String nome;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 50; i++){
            System.out.print("Digite o nome do aluno: ");
            nome = sc.nextLine();
            System.out.print("Digite a idade do aluno: ");
            idade = sc.nextInt();

            if (idade < 18){
                cont_menor++;
            } else {
                cont_maior++;
            }
            sc.nextLine();
        }
        System.out.println(cont_maior+" são maior de 18 anos!");
        System.out.println(cont_menor+" são menor de 18 anos!");
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes