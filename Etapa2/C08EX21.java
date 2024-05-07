package Etapa2;

import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {
        double altura, peso, IMC;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();

        for (int i = 60; i <= 100; i++){
            peso = i;
            IMC = peso / Math.pow(altura,2);
            if(IMC < 20){
                System.out.println("| PESO = "+peso+" | IMC = "+IMC+" | ABAIXO DO PESO");
            } else if (IMC <= 25) {
                System.out.println("| PESO = "+peso+" | IMC = "+IMC+" | PESO IDEAL");
            } else {
                System.out.println("| PESO = "+peso+" | IMC = "+IMC+" | ACIMA DO PESO");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes