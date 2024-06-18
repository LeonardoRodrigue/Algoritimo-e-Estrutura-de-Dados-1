package Etapa3;

import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 numeros para saber se são divisiveis por 5 r 7 ao mesmo tempo!");

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 5 == 0 && numeros[i] % 7 == 0){
                cont++;
            }
        }
        System.out.println("Quantidade de numeros divisiveis por 5 e 7 ao mesmo tempo: "+cont);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes