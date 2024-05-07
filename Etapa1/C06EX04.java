package Etapa1;

import java.util.Scanner;

public class C06EX04 {
    public static void main(String[] args) {
        String nome;
        double altura, peso, IMC;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();

        IMC = peso / (Math.pow(altura,2));

        if (IMC < 18) {
            System.out.print("Pessoa esta desnutrida!");
        } else {
            if (IMC >= 18 && IMC < 20){
                System.out.print("Pessoa esta abaixo do peso!");
            } else if (IMC >= 20 && IMC >=25) {
                System.out.print("Pessoa esta no peso ideal!");
            } else if (IMC > 20 && IMC <= 27) {
                System.out.print("Pessoa esta acima do peso");
            } else {
                System.out.print("Pessoa esta obesa!");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes