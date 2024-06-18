package Etapa3;

import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int divisiveis[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 3 == 0){
                divisiveis[i] = numeros[i];
            } else {
                divisiveis[i] = -1;
            }
        }

        System.out.println("Numeros divisiveis por 3");

        for (int i = 0; i < divisiveis.length; i++){
            if (divisiveis[i] != -1){
                System.out.print(divisiveis[i]+" ");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes