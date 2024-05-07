package Etapa1;

import java.util.Scanner;

public class C05EX12 {
    public static void main(String[] args) {
        int segundos, minutos, horas;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de segundos: ");
        segundos = sc.nextInt();

        minutos = segundos / 60;
        horas = minutos / 60;

        System.out.print("Segundos --> " + segundos + " ,Horas -- > " + horas + " ,Minutos --> " + minutos + " ,Segundos --> " + segundos);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes