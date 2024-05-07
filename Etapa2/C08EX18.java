package Etapa2;

import java.util.Scanner;

public class C08EX18 {
    public static void main(String[] args) {
        int numero, resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para saber sua tabuada: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes