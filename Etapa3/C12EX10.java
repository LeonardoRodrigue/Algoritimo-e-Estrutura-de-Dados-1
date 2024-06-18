package Etapa3;

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {
        String nome[] = new String[50];
        double nota[] = new double[50];
        double soma = 0, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome e a nota de 50 alunos!");

        for (int i = 0; i < nome.length; i++){
            System.out.print("Digite o nome do aluno: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = sc.nextDouble();
            sc.nextLine();
            soma += nota[i];
        }
        media = soma / nota.length;
        for (int i = 0; i < nota.length; i++){
            if(nota[i] > media){
                System.out.println(nome[i]+" ficou acima da média");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes