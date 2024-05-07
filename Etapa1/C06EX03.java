package Etapa1;

import java.util.Scanner;

public class C06EX03 {
    public static void main(String[] args) {
        double salario, comissao, vendas;
        double valor_fixo = 240;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de vendas: ");
        vendas = sc.nextDouble();

        if (vendas <= 1000){
            comissao = 0;
        } else {
            if (vendas > 1000 && vendas <= 10000){
                comissao = vendas * 0.1;
            } else {
                comissao = 1000;
            }
        }

        salario = valor_fixo + comissao;

        System.out.print("O sálario é: " + salario);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes