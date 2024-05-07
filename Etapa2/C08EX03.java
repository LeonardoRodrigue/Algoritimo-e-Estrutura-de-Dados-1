package Etapa2;

import java.util.Scanner;

public class C08EX03 {
    public static void main(String[] args) {
        double nota_final;
        int faltas, cont_aprov = 0, cont_reprov = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.print("Digite a valor da sua nota final: ");
            nota_final = sc.nextDouble();

            if (nota_final == -1){
                break;
            }

            System.out.print("Digite o numero de faltas: ");
            faltas = sc.nextInt();

            if (nota_final >= 65 && faltas <= 16){
                System.out.println("Aluno aprovado!");
                cont_aprov++;
            } else {
                System.out.println("Aluno reprovado!");
                cont_reprov++;
            }
        }
        System.out.println(cont_aprov+ " alunos foram aprovados!");
        System.out.println(cont_reprov+ " alunos foram reprovados!");
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes