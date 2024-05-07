package Etapa2;

import java.util.Scanner;

public class C08EX29 {
    public static void main(String[] args) {
        int x, y, potencia = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero x: ");
        x = sc.nextInt();
        if (x < 0){
            System.out.println("Digite um numero válido!");
            return;
        }
        System.out.print("Digite o numero y: ");
        y = sc.nextInt();
        if (y < 0){
            System.out.println("Digite um numero válido!");
            return;
        }
        for (int i = 1; i <= y; i++){
            potencia *= x;
        }
        System.out.println("O resultado é "+potencia);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes