package Etapa2;

import java.util.Scanner;

public class C11EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canal, contadorCanal4 = 0, contadorCanal7 = 0, contadorCanal12 = 0, totalPessoas = 0;

        for (int x = 1; x <= 100; x++) {
            System.out.println("Informe o canal assistido (4, 7 ou 12): ");
            canal = scanner.nextInt();

            if (canal == 4 || canal == 7 || canal == 12) {
                System.out.println("Informe o número de pessoas assistindo: ");
                int pessoas = scanner.nextInt();
                totalPessoas += pessoas;

                if (canal == 4)
                    contadorCanal4 += pessoas;
                else if (canal == 7)
                    contadorCanal7 += pessoas;
                else if (canal == 12)
                    contadorCanal12 += pessoas;
            }
        }

        double porcentCanal4 =  contadorCanal4 / totalPessoas * 100;
        double porcentCanal7 =  contadorCanal7 / totalPessoas * 100;
        double porcentCanal12 =  contadorCanal12 / totalPessoas * 100;

        int canalMaisAssistido = 0;
        int maiorAudiencia = 0;
        if (contadorCanal4 >= contadorCanal7 && contadorCanal4 >= contadorCanal12) {
            canalMaisAssistido = 4;
            maiorAudiencia = contadorCanal4;
        } else if (contadorCanal7 >= contadorCanal12) {
            canalMaisAssistido = 7;
            maiorAudiencia = contadorCanal7;
        } else {
            canalMaisAssistido = 12;
            maiorAudiencia = contadorCanal12;
        }

        int mediaPessoas = totalPessoas / 100;

        System.out.println("A audiência de cada canal pesquisado foi:");
        System.out.println("Canal 4: " + contadorCanal4);
        System.out.println("Canal 7: " + contadorCanal7);
        System.out.println("Canal 12: " + contadorCanal12);

        System.out.println("A porcentagem de cada canal assistido foi:");
        System.out.println("Canal 4: " + porcentCanal4 + "%");
        System.out.println("Canal 7: " + porcentCanal7 + "%");
        System.out.println("Canal 12: " + porcentCanal12 + "%");

        System.out.println("O canal mais assistido foi o canal " + canalMaisAssistido);
        System.out.println("A média de pessoas assistindo TV foi: " + mediaPessoas);

        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes