package Etapa2;

import java.util.Scanner;

public class C08EX22 {
    public static void main(String[] args) {
        int numero;
        boolean primo = true;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para saber se ele é primo: ");
        numero = sc.nextInt();

        if (numero < 1){
            System.out.println("Numero inválido!");
            return;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++){
           if (numero % i == 0){
               primo = false;
               break;
           }
        }
        if (primo == true){
            System.out.println("É um numero primo!");
        } else {
            System.out.println("Não é um numero primo!");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes