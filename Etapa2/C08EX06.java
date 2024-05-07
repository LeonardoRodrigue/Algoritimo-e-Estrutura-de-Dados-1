package Etapa2;

import java.util.Scanner;

public class C08EX06 {
    public static void main(String[] args) {
        int numero, soma = 0, quant_divisiveis = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite um numero inteiro: ");
            numero = sc.nextInt();

            if (numero % 2 == 0){
                System.out.print("Este numero é par!\n");
            } else {
            System.out.print("Este numero é impar!\n");
            }

            if (numero % 4 == 0){
                soma += numero;
            }

            if (numero % 3 == 0){
                quant_divisiveis++;
            }

        }
        System.out.println("A soma dos numeros divisiveis por 4 são = "+soma);
        System.out.println("A quantidade de numeros divisiveis por 3 são = "+quant_divisiveis);
        sc.close();
    }
}
