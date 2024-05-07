package Etapa2;

import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args) {
        double[] precos = {1565.00, 1890.00, 2150.00, 2963.00, 3750.00};

        int[] quantidadesVendidas = new int[5];

        double faturamentoTotal = 0.0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a quantidade vendida do modelo " + (char)('A' + i) + ": ");
            quantidadesVendidas[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            faturamentoTotal += quantidadesVendidas[i] * precos[i];
        }

        System.out.println("Faturamento total do período: R$" + faturamentoTotal);

        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes