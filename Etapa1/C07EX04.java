package Etapa1;

import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        
        String equipe, estado = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o nome da equipe: ");
        equipe = sc.nextLine();
        
        switch (equipe) {
            case "America": case "Atletico": case "Cruzeiro": case "Villa Nova":
                estado = "Minas Gerais";
                break;
            case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
                estado = "Rio de Janeiro";
                break;
            case "Corinthians": case "Palmeiras": case "Santos": case "São Paulo":
                estado = "São Paulo";
                break;   
            case "Gremio": case "Internacional": case "Juventude":
                estado = "Rio Grnade do Sul";
                break;  
            case "Náutico": case "Santa Cruz": case "Sport":
                estado = "Pernambuco";
                break;  
            default:
                System.out.println("\nDigite o nome da cidade corretamente!");
                break;
        }

        System.out.println("\nO estado do time é do " + estado + "\n");

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes