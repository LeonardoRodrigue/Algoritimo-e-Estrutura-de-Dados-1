package Etapa2;

import java.util.Scanner;

public class C09EX04 {
    public static void main(String[] args) {
        double num, den, calculo, serie=0;
        int quant_repeticoes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de repetições que o codigo irá rodar: ");
        quant_repeticoes = sc.nextInt();

        for (int i=1; i<=quant_repeticoes; i++) {
            if (i == 1){
                num = (i) * (i + 1);
                den = (i + 2) * (i + 3);
            } else {
                num = (Math.pow(i, 2) + 1) * (Math.pow(i, 2) + 2);
                den = (Math.pow(i, 2) + 3) * (Math.pow(i, 2) + 4);
            }
            serie += num / den;
        }
        calculo = Math.sqrt(serie);
        System.out.print("Valor da Série = "+calculo);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes