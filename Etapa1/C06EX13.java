package Etapa1;

import java.util.Scanner;

public class C06EX13 {
    public static void main(String[] args) {
        int horas, minutos = 0;
        int hora_inicio, hora_final, minuto_inicio, minuto_final;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora que iniciou o jogo: ");
        hora_inicio = sc.nextInt();
        System.out.print("Digite o minuto que iniciou o jogo: ");
        minuto_inicio = sc.nextInt();
        System.out.print("Digite a hora que terminou o jogo: ");
        hora_final = sc.nextInt();
        System.out.print("Digite o minuto que terminou o jogo: ");
        minuto_final = sc.nextInt();

        horas = hora_final - hora_inicio;
        if (minuto_inicio < minuto_final){
            minutos = minuto_final - minuto_inicio;
        } else if (minuto_inicio > minuto_final) {
            horas -= 1;
            minutos = 60 - (minuto_inicio - minuto_final);
        }
        
        System.out.println("O jogo durou " + horas + " horas e " + minutos + " minutos");
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes