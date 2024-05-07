package Etapa1;

import java.util.Scanner;

public class C05EX14 {
    public static void main(String[] args) {
        double c, tempo, velocidade, tempo_relativo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do tempo em segundos (t): ");
        tempo = sc.nextDouble();

        System.out.print("Digite o valor da velocidade em m/s (v): ");
        velocidade = sc.nextDouble();

        c = 3 * Math.pow(10, 8);
        tempo_relativo = tempo / Math.sqrt(1 - Math.pow(velocidade / c, 2));

        System.out.printf("O tempo relativo é %.4f segundos.\n", tempo_relativo);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes