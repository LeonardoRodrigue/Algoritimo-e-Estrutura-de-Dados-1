package Etapa1;

import java.util.Scanner;

public class C06EX07 {
    public static void main(String[] args) {

        double salario, pl_bruto, pl_liquido, imp_renda;
        int vlr_fixo, percentual;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        salario = sc.nextDouble();

        if (salario <= 300) {
            vlr_fixo = 500;
            percentual = (int) (salario * 0.7);
        } else if (salario > 300 && salario <= 1000) {
            vlr_fixo = 200;
            percentual = (int) (salario * 0.5);
        } else {
            vlr_fixo = 0;
            percentual = (int) (salario * 0.3);
        }

        pl_bruto = vlr_fixo + percentual;
        imp_renda = pl_bruto * 0.25;
        pl_liquido = pl_bruto - imp_renda;

        System.out.print("O PL Líquido referente ao seu salario é: " + pl_liquido);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes