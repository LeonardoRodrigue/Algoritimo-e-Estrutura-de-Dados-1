package Etapa1;

import java.util.Scanner;

public class C07EX03 {
    public static void main(String[] args) {
        double imposto, multa = 0;
        int dias;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do imposto: ");
        imposto = sc.nextDouble();
        System.out.print("Digite a quantidade de dias em atraso: ");
        dias = sc.nextInt();

        switch (dias){
            case 1: case 2: case 3: case 4: case 5:
                multa = 0;
                break;
            case 6: case 7: case 8:
                multa = imposto * 0.02;
                break;
            case 9: case 10:
                multa = imposto * (0.10 + (0.005 * dias));
                break;
            default:
                multa = imposto * 1.5 + dias;
                break;
        }

        System.out.printf("O valor da multa é: R$%1.2f", multa);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes