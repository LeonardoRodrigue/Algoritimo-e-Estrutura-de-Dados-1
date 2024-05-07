package Etapa2;

import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
        double num, den, calculo, serie=0;
        int quant_repeticoes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de repetições que o codigo irá rodar: ");
        quant_repeticoes = sc.nextInt();

        for (int i=0; i<quant_repeticoes; i++) {
            if (i == 0){
                num = 3;
                den = 7;
            } else {
                num = (i * 2) + ((i * 3) + 3);
                den = (i * 6) + 7;
            }
            serie += num / den;
        }
        calculo = 5 * serie;
        System.out.print("Valor da Série = "+calculo);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes