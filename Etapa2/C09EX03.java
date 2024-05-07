package Etapa2;

import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args) {
        double num, den, serie=0;
        int quant_repeticoes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de repetições que o codigo irá rodar: ");
        quant_repeticoes = sc.nextInt();

        for (int i=1; i<=quant_repeticoes; i++) {
            num = 1 + Math.sqrt(i*4);
            den = i * 3;
            serie += num / den;
        }
        System.out.print("Valor da Série = "+serie);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes