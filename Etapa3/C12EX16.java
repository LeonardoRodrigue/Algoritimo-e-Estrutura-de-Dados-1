package Etapa3;

import java.util.Scanner;

public class C12EX16 {
    public static void main(String[] args) {
        String cidades[] = new String[100];
        String estado[] = new String[100];
        int populacao[] = new int[100];
        String cidade_temporario = "", estado_temporario = "";
        int populacao_temporario = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nomes, quantidade da população e o estado que se localiza de 100 cidades!");

        for (int i = 0; i < cidades.length; i++) {
            System.out.print("Digite o nome da cidade: ");
            cidades[i] = sc.nextLine();
            System.out.print("Digite a quantidade da população: ");
            populacao[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome do estado: ");
            estado[i] = sc.nextLine();
        }
        for (int i = 0; i < populacao.length - 1; i++) {
            for (int x = 0; x < populacao.length - 1; x++) {
                if (populacao[x] > populacao[x + 1]) {
                    populacao_temporario = populacao[x];
                    populacao[x] = populacao[x + 1];
                    populacao[x + 1] = populacao_temporario;
                    cidade_temporario = cidades[x];
                    cidades[x] = cidades[x + 1];
                    cidades[x + 1] = cidade_temporario;
                    populacao[x + 1] = populacao_temporario;
                    estado_temporario = estado[x];
                    estado[x] = estado[x + 1];
                    estado[x + 1] = estado_temporario;
                }
            }
        }
        for (int i = populacao.length; i > 20; i--){
            System.out.println(cidades[i] + ", " + estado[i] + " com a população de "+populacao[i]+" habitantes.");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes