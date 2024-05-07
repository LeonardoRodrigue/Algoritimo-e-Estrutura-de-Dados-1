package Etapa1;

import java.util.Scanner;

public class C06EX02 {
    public static void main(String[] args) {
        double quant_polu, multa;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de poluentes: ");
        quant_polu = sc.nextDouble();

        if (quant_polu <= 1500){
            multa = 0;
        } else {
            if (quant_polu > 1500 && quant_polu <= 3500){
                multa = 3000;
            } else {
                multa = quant_polu * 5000;
            }
        }
        System.out.print("A multa é de: " + multa);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes