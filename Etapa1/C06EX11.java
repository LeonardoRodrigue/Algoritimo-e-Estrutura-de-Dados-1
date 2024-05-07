package Etapa1;

import java.util.Scanner;

public class C06EX11 {
    public static void main(String[] args) {
        
        int pontos_team1 = 0, sets_team1, pontos_team2 = 0, sets_team2;
        String nome_team1, nome_team2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira equipe: ");
        nome_team1 = sc.nextLine();
        System.out.print("Digite a quantidade de sets ganhos da primeira equipe (de 1 a 3): ");
        sets_team1 = sc.nextInt();
        System.out.print("Digite o nome da segunda equipe: ");
        sc.nextLine();
        nome_team2 = sc.nextLine();
        System.out.print("Digite a quantidade de sets ganhos da segunda equipe(de 1 a 3): ");
        sets_team2 = sc.nextInt();

        if (sets_team1 == 3) {
            pontos_team1 = 3;
            pontos_team2 = 0;
        } else if (sets_team1 == 2) {
            pontos_team1 = 1;
            pontos_team2 = 2;
        } else if (sets_team1 == 1) {
            pontos_team1 = 1;
            pontos_team2 = 2;
        } else if (sets_team1 == 0) {
            pontos_team1 = 0;
            pontos_team2 = 3;
        } else {
            System.out.println("Digite valores corretos!");
        }

        System.out.println("\nEquipe 1: " + nome_team1 + "\nSets equipe 1 = " + sets_team1 + "\n --> Pontos " + nome_team1 + " = " + pontos_team1);
        System.out.println("\nEquipe 1: " + nome_team2 + "\nSets equipe 1 = " + sets_team2 + "\n --> Pontos " + nome_team2 + " = " + pontos_team2 + "\n");

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes