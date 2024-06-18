package Etapa3;

import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {
        String nome[] = new String[8];
        double nota[] = new double[8];
        double maior_nota = 0;
        int quantidade_notas = 0, indice = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome e a nota de 50 alunos!");

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > maior_nota) {
                maior_nota = nota[i];
                quantidade_notas = 1;
            } else if (nota[i] == maior_nota) {
                quantidade_notas++;
            }
        }

        String nome_maiores_notas[] = new String[quantidade_notas];

        for (int i = 0; i < nota.length; i++){
            if (nota[i] >= maior_nota){
                nome_maiores_notas[indice] = nome[i];
                indice++;
            }
        }
        System.out.print("Os alunos que obtiveras as maiores notas são: ");
        for (int i = 0; i < nome_maiores_notas.length; i++){
            System.out.print(nome_maiores_notas[i]+", ");
        }

        sc.close();
    }
}
// Leonardo Rodrigues Reis Lopes