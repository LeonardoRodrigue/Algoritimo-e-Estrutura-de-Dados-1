package Etapa3;

import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {
        String meses[] = new String[12];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os meses dos anos!");

        for (int i = 0; i < meses.length; i++){
            System.out.print("Digite o nome do mês: ");
            meses[i] = sc.nextLine();
        }
        for (int i = meses.length - 1; i >= 0; i--){
            System.out.print(meses[i]+" ");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes