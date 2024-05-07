package Etapa1;

import java.util.Scanner;

public class C05EX09 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media, result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);
        //result = media / 3;

        System.out.print("A media desse aluno é: " + media);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes