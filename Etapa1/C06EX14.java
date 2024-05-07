package Etapa1;

import java.util.Scanner;

public class C06EX14 {
    public static void main(String[] args) {
        
        int numero, n1, n2, n3 ,n4;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero de 4 digitos: ");
        numero = sc.nextInt();

        if (numero < 0 && numero > 9999){
            System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
        } else{
            n1 = numero / 1000;
            n2 = numero / 100 % 10;
            n3 = numero / 10 % 10;
            n4 = numero % 10;
            System.out.print(n4 + "" + n3 + "" + n2 + "" + n1);
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes