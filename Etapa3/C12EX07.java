package Etapa3;

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {
        String nome[] = new String[50];
        double nota[] = new double[50];
        String conceito = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome e a nota final dos 50 alunos!");

        for (int i = 0; i < nome.length; i++){
            System.out.print("Digite o nome do aluno: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < nome.length; i++){
            if (nota[i] <= 30){
                conceito = "D";
            } else if (nota[i] <= 60) {
                conceito = "C";
            } else if (nota[i] <= 80) {
                conceito = "B";
            } else {
                conceito = "A";
            }
            System.out.println("Nome = "+nome[i]+", Nota = "+nota[i]+" e o Conceito é = "+conceito);
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes