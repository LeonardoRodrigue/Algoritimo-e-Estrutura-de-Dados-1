package Etapa2;

import java.util.Scanner;

public class C11EX01 {
    public static void main(String[] args) {
        double fx, soma = 0, media = 0;
        int limite, cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero limite para calcular a função f(x): ");
        limite = sc.nextInt();

        for (int i = 1; i <= limite; i++){
            if (i % 2 != 0){
                fx = Math.pow(i,2) + (double) ((4 * i) - 2) / 5;
                cont++;
                soma += fx;
            }
        }
        media = soma / cont;
        System.out.println("A média de f(x) = "+media+" --> ("+soma+" / "+cont+")");
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes