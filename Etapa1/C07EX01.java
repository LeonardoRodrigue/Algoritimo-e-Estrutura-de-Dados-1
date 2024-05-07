package Etapa1;

import java.util.Scanner;

public class C07EX01 {
    public static void main(String[] args) {
        int num_acertos, premio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de acertos: ");
        num_acertos = sc.nextInt();

        switch (num_acertos) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Nenhum prêmio.");
                break;
            case  6: case 7: case 8: case 9: case 10:
                System.out.println("Ganha outro cartão.");
                break;
            case  11:
                System.out.println("Prêmio de R$100,00.");
                break;
            case  12:
                System.out.println("Prêmio de R$1.000,00.");
                break;
            case  13:
                System.out.println("Prêmio de R$50.000,00.");
                break;
            default:
                System.out.println("Digite um numero de 1 a 13!");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes