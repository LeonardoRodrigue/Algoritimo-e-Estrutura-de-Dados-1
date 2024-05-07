package Etapa1;

import java.util.Scanner;

public class C06EX08 {
    public static void main(String[] args) {

        double peso, altura, IMC;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();

        IMC = peso / Math.pow(altura,2);

        if (IMC < 20) {
            System.out.print("Pessoa está abaixo do peso");
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.print("Pessoa está no peso ideal");
        } else {
            System.out.print("Pessoa está acima do peso");
        }

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes