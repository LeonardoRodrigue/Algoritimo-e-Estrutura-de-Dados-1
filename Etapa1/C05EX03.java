package Etapa1;

import java.util.Scanner;

public class C05EX03 {
    public static void main(String[] args) {
        double salario, liquido, imp_renda;
        int num_dependentes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario bruto: ");
        salario = sc.nextDouble();
        System.out.print("Digite o numero de dependentes: ");
        num_dependentes = sc.nextInt();

        liquido = salario - (num_dependentes * 60);
        imp_renda = liquido * 0.15;

        System.out.print("Salario = " + salario + " e Dependentes = " + num_dependentes +
                "\n Salario Liquido = " + liquido + " e Imposto de Renda = " + imp_renda);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes