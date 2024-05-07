package Etapa1;

import java.util.Scanner;

public class C07EX05 {
    public static void main(String[] args) {
        String p1, p2, p3, p4, p5;
        int respostas_sim = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        p1 = sc.nextLine();
        System.out.println("Esteve no local do crime?");
        p2 = sc.nextLine();
        System.out.println("Mora perto da vítima?");
        p3 = sc.nextLine();
        System.out.println("Devia para a vítima?");
        p4 = sc.nextLine();
        System.out.println("Já trabalhou com a vítima?");
        p5 = sc.nextLine();

        switch (p1) {
            case "Sim": case "sim":
                respostas_sim += 1;
                break;
        }
        switch (p2) {
            case "Sim": case "sim":
                respostas_sim += 1;
                break;
        }
        switch (p3) {
            case "Sim": case "sim":
                respostas_sim += 1;
                break;
        }
        switch (p4) {
            case "Sim": case "sim":
                respostas_sim += 1;
                break;
        }
        switch (p5) {
            case "Sim": case "sim":
                respostas_sim += 1;
                break;
        }

        switch (respostas_sim) {
            case 1: case 2:
                System.out.println("Suspeito(a)");
                break;
            case 3: case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assasino(a)");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes