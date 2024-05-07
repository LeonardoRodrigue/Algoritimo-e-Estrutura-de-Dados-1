package Etapa2;

import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {
        double altura, peso, media, altura_total_homens = 0;
        int cont = 0, cont_mulheres = 0, cont_homens = 0, cont_mulheres_menor_60 = 0;
        String sexo;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite a altura: ");
            altura = sc.nextDouble();
            if (altura == 0){
                break;
            }
            System.out.print("Digite o peso: ");
            peso = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite o sexo (F - Feminino ou M - Masculino): ");
            sexo = sc.nextLine();
            cont++;
            switch (sexo) {
                case "F":
                    cont_mulheres++;
                    if (peso < 60) {
                        cont_mulheres_menor_60++;
                    }
                    break;
                case "M":
                    cont_homens++;
                    altura_total_homens += altura;
                    break;
            }
        } while (altura != 0);
        media = altura_total_homens / cont_homens;
        System.out.println("\nTotal de pessoas pesquisadas = "+cont);
        System.out.println("Quantidade de mulheres = "+cont_mulheres);
        System.out.println("Altura média dos homens = "+media);
        System.out.println("Quantidade de mulheres com peso inferior a 60 = "+cont_mulheres_menor_60);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes