package Etapa3;

import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) {
        int corredores[] = new int[20];
        int primeiros[] = new int[10];
        int ultimos[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os numeros dos 20 corredores em ordem de chegada!");

        for (int i = 0; i < corredores.length; i++){
            System.out.print("Digite o numero do "+(i + 1)+"º corredor: ");
            corredores[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            primeiros[i] = corredores[i];
            ultimos[i] = corredores[i + 10];
        }
        for (int i = 0; i < 10; i++){
            System.out.println((i + 1)+"º - "+primeiros[i]+" / "+ultimos[i]);
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes