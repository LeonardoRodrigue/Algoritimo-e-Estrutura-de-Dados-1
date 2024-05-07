package Etapa1;

import java.util.Scanner;

public class C07EX02 {
    public static void main(String[] args) {
        double nota1, nota2 ,nota3;
        int media;
        String conceito = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o resoltado da primeira prova: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite o resoltado da segunda prova: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite o resoltado da terceira prova: ");
        nota3 = sc.nextDouble();

        media = (int) ((nota1 + nota2 + nota3) / 3);

        switch (media){
            case 1: case 2: case 3: case 4:
                conceito = "E";
                break;
            case 5: case 6:
                conceito = "D";
                break;
            case 7:
                conceito = "C";
                break;
            case 8:
                conceito = "B";
                break;
            case 9: case 10:
                conceito = "A";
                break;
            default:
                break;
        }
        System.out.println("Conceito " + conceito);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes