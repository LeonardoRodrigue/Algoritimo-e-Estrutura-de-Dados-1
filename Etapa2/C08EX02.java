package Etapa2;

import java.util.Scanner;

public class C08EX02 {
    public static void main(String[] args) {
        double nota_final;
        int faltas;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 50; i++){
            System.out.print("Digite a valor da sua nota final: ");
            nota_final = sc.nextDouble();

            if (nota_final == -1){
                break;
            }

            System.out.print("Digite o numero de faltas: ");
            faltas = sc.nextInt();

            if (nota_final >= 65 && faltas <= 16){
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes