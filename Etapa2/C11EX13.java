package Etapa2;

import java.util.Scanner;
public class C11EX13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, den, serie = 0, s;
        int termos;

        do {
            System.out.print("Informe o número de termos para se calcular o valor de S: ");
            termos = scanner.nextInt();
            if (termos <= 0) {
                break;
            }
            for (int aux = 1; aux <= termos; aux++) {
                num = aux * (Math.pow(10 * aux + 9, 2 * aux));
                den = Math.pow(7, aux - 1);
                serie += num / den;

            }
            s = 71 + Math.cbrt(serie);
            System.out.println("O valor da série S é " + s);
        } while (true);

        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes