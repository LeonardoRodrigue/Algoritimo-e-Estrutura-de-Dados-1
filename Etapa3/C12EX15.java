package Etapa3;

import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {
        String meses[] = new String[12];
        String temp = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nomes dos meses!");

        for (int i = 0; i < meses.length; i++){
            System.out.print("Digite o nome do mês: ");
            meses[i] = sc.nextLine();
        }
        for (int i = 0; i < meses.length - 1; i++) {
            for (int x = 0; x < meses.length - 1; x++) {
                if (meses[x].compareToIgnoreCase(meses[x+1])>0) {
                    temp = meses[x];
                    meses[x] = meses[x+1];
                    meses[x+1] = temp;
                }
            }
        }
        for (int i = 0; i < meses.length; i++){
            System.out.print(meses[i]+" ");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes