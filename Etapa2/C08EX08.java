package Etapa2;

import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args) {
        double nota, media = 0, soma = 0;
        int faltas, aprovados = 0, reprovados = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.print("Digite a nota do aluno: ");
            nota = sc.nextDouble();
            System.out.print("Digite a quantidade de faltas do aluno: ");
            faltas = sc.nextInt();
            if (nota >= 65 && faltas <= 16){
                System.out.println("Aluno aprovado!");
                soma += nota;
                aprovados++;
            } else if (faltas > 16) {
                reprovados++;
                System.out.println("Aluno reprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }
        media = soma / aprovados;
        System.out.println("A media dos aprovados é --> "+media);
        System.out.println("Quantidade de alunos com mais de 16 faltas --> "+reprovados);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes