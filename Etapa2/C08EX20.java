package Etapa2;

import java.util.Scanner;
import java.math.BigInteger;

public class C08EX20 {
    public static void main(String[] args) {
        int quantidade_reps;
        BigInteger soma = BigInteger.ZERO, numero = BigInteger.ONE;


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de repetições que o programa irá rodar: ");
        quantidade_reps = sc.nextInt();

        for (int i = 1; i <= quantidade_reps; i++){
            System.out.println(numero);
            soma = soma.add(numero);
            numero = numero.multiply(BigInteger.valueOf(2));
        }
        System.out.println("A soma dos "+quantidade_reps+" primeiros numeros é: "+soma);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes