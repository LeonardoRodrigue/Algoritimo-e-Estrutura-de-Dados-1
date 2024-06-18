package Etapa3;

import java.util.Scanner;

public class C13EX04 {
    public static void main(String[] args) {
        int numero, numero_aleatorio, cont = 0;
        double num;

        Scanner sc = new Scanner(System.in);

        num = Math.random() * 100;
        numero_aleatorio = (int) Math.round(num);

        System.out.println("Adivinhe o numero entre 0 e 100!");
        do {
            System.out.print("Digite o numero: ");
            numero = sc.nextInt();
            if (numero < numero_aleatorio){
                System.out.println("MAIOR");
            } else if (numero > numero_aleatorio) {
                System.out.println("MENOR");
            } else {
                System.out.println("ACERTOU");
            }
            cont++;
        } while (numero != numero_aleatorio);

        System.out.println("Acertou o numero em "+cont+" tentativas.");
        sc.close();
    }
}
