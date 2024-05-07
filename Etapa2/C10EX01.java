package Etapa2;

import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args) {
        double valor, multa, tot_multas = 0, media = 0;
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Digite o valor para saber o valor da multa: ");
            valor = sc.nextDouble();
            if (valor == -1){
                break;
            }
            multa = valor * 0.1;
            cont++;
            tot_multas += multa;
            System.out.println("O valor da multa é = "+multa);
        } while (valor != -1);

        media = tot_multas / cont;
        System.out.println("A media dos valores das multas é "+media);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes