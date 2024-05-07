package Etapa2;

import java.util.Scanner;

public class C08EX30 {
    public static void main(String[] args) {
        int x, n;
        double s, num, den, logaritimo = 2.71828, serie = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero x: ");
        x = sc.nextInt();
        System.out.print("Digite um numero n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            num = Math.pow(x,i);
            den = i;
            serie += num / den;
        }
        s = (logaritimo * x) + serie;
        System.out.println("S = "+s);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes