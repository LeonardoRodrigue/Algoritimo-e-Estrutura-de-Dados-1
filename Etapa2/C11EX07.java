package Etapa2;

import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorTemperatura=0, menorTemperatura=0, mediaTemperatura=0, diasMaiorTemperatura=0, somaTemperatura=0, temperatura, dias=121;
        for (int aux = 1; aux <= 121; aux++) {
            System.out.println("Informe a Temperatura registrada no dia: ");
            temperatura = scanner.nextInt();
            somaTemperatura++;
            // Atualiza Maior Temperatura
            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
                diasMaiorTemperatura = 1; // Reinicia o contador

            } else if (temperatura == maiorTemperatura) {
                diasMaiorTemperatura++; // Incrementa o contador
            }

            // Atualiza a menor temperatura
            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }

            // Atualiza a média da temperatura
            mediaTemperatura += temperatura;
        }

        // Calcula a média da temperatura
        mediaTemperatura /= dias;


        System.out.println("Maior temperatura registrada: " + maiorTemperatura);
        System.out.println("Menor temperatura registrada: " + menorTemperatura);
        System.out.println("Média de temperatura: " + mediaTemperatura);
        System.out.println("Número de dias com a maior temperatura: " + diasMaiorTemperatura);
        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes