package Etapa3;

import java.util.Scanner;

public class C12EX11 {
    public static void main(String[] args) {
        String nome[] = new String[50];
        double nota[] = new double[50];
        String nome_maior_nota = "";
        double maior_nota = 0;

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
            if (i == 0 || nota[i] > maior_nota) {
                nome_maior_nota = nome[i];
                maior_nota = nota[i];
            }
        }
        System.out.println("O aluno(a) que tirou a maior nota é: "+nome_maior_nota);
        sc.close();
    }
}
// Leonardo Rodrigues Reis Lopes