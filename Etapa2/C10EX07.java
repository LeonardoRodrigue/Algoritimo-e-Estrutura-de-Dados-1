package Etapa2;

import java.util.Scanner;

public class C10EX07 {
    public static void main(String[] args) {
        int quantidade_pessoas, dias = 0, meses = 0, anos = 0;
        double pessoas_contaminadas = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que ha na população: ");
        quantidade_pessoas = sc.nextInt();

        do {
            if (pessoas_contaminadas >= quantidade_pessoas) {
                break;
            }
            pessoas_contaminadas *= 1.003;
            dias++;
            if (dias >= 30){
                meses ++;
                dias = 0;
            }
            if (meses >= 12) {
                anos++;
                meses = 0;
            }
        } while (pessoas_contaminadas < quantidade_pessoas);

        System.out.println("Anos = "+anos+", meses = "+meses+", dias = "+dias);

        sc.close();
    }
}