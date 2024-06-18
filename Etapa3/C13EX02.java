package Etapa3;

import java.util.Scanner;

public class C13EX02 {
    public static void main(String[] args) {
        double x;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o valor de X: ");
            x = sc.nextDouble();
            if (x == -1){
                break;
            }
            System.out.println("O valor de f(x) = "+C13EX02_classe.calcula_fx(x));
        } while (x != -1);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes