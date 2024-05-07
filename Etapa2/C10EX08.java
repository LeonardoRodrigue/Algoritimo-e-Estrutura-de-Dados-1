package Etapa2;

import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
        int populacao, num_eleitores, num_homens, num_mulheres;
        int cont = 0,cont_mais_mulheres = 0, media_homens;
        int populacao_total = 0, total_eleitores = 0, total_homens = 0, menor_populacao = 999999999;
        double percentual_eleitores;
        String nome, nome_menor_populacao = "";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o nome da cidade: ");
            nome = sc.nextLine();
            System.out.print("Digite a quantidade de habitantes: ");
            populacao = sc.nextInt();
            System.out.print("Digite a quantidade de eleitores: ");
            num_eleitores = sc.nextInt();
            System.out.print("Digite a quantidade de mulheres: ");
            num_mulheres = sc.nextInt();
            System.out.print("Digite a quantidade de homens: ");
            num_homens = sc.nextInt();
            sc.nextLine();
            if (num_mulheres + num_homens != populacao){
                System.out.println("Valores de mulheres e homens incorretos!");
            }
            cont++;
            populacao_total += populacao;
            total_eleitores += num_eleitores;
            total_homens += num_homens;
            if (num_mulheres > num_homens){
                cont_mais_mulheres++;
            }
            if (populacao < menor_populacao){
                nome_menor_populacao = nome;
                menor_populacao = populacao;
            }
        } while (!nome.equalsIgnoreCase("Zimbabue de Minas"));
        media_homens = total_homens / cont;
        percentual_eleitores = (double) total_eleitores / populacao_total;
        System.out.println("Total de cidades = "+cont);
        System.out.println("População total = "+populacao_total);
        System.out.println("Percentual de eleitores = "+percentual_eleitores);
        System.out.println("Cidades com mais mulheres que homens =  "+cont_mais_mulheres);
        System.out.println("Média de homens = "+media_homens);
        System.out.println("Cidade com menor população = "+nome_menor_populacao);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes