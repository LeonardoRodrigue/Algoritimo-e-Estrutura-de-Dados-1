package Etapa3;

import java.util.Scanner;

public class C13EX05 {
    public static void main(String[] args) {
        double angulo, radiano, seno, cosseno, tangente, arco_seno, arco_cosseno, arco_tangente;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do angulo: ");
        angulo = sc.nextDouble();

        radiano = angulo * (Math.PI / 180);
        seno = Math.sin(radiano);
        cosseno = Math.cos(radiano);
        tangente = Math.tan(radiano);
        arco_seno = 1 / seno;
        arco_cosseno = 1 / cosseno;
        arco_tangente = 1 / tangente;

        System.out.println("O valor do seno é "+seno);
        System.out.println("O valor do cosseno é "+cosseno);
        System.out.println("O valor da tangente é "+tangente);
        System.out.println("O valor do arco seno é "+arco_seno);
        System.out.println("O valor do arco cosseno é "+arco_cosseno);
        System.out.println("O valor do arco tangente é "+arco_tangente);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes