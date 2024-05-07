package Etapa2;

import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        double num, den, calculo, serie = 0, elev = 0.5;
        int quant_repeticoes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de repetições que o codigo irá rodar: ");
        quant_repeticoes = sc.nextInt();

        for (int i = 1; i <= quant_repeticoes; i++) {
            num = Math.pow(9, elev += 0.5);
            den = (i + 9) * Math.sqrt(Math.pow(i, 4));
            serie += num / den;
        }

        calculo = 100 - Math.pow(serie, 3);
        System.out.print("Valor da Série = "+calculo);
    }
}

// Leonardo Rodrigues Reis Lopes