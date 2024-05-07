package Etapa1;

import java.util.Scanner;

public class C06EX12 {
    public static void main(String[] args) {
        int caixa_de_papelao = 10, galpao_armazem = 850;
        int bolas_produzidas, bolas_defeito, meses_copa;
        double vlr_caixas, vlr_aluguel, vlr_total_emb, vlr_total_estoque, vlr_total;
        double quantidade_caixas, quantidade_galpoes = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de bolas produzidas pela fábrica: ");
        bolas_produzidas = sc.nextInt();
        System.out.print("Digite a quantidade de bolas com defeito: ");
        bolas_defeito = sc.nextInt();
        System.out.print("Digite o preço unitário das caixas de papelão: ");
        vlr_caixas = sc.nextDouble();
        System.out.print("Digite a quantidade de meses ate a Copa: ");
        meses_copa = sc.nextInt();
        System.out.print("Digite o valor mensal do aluguel do galpão: ");
        vlr_aluguel = sc.nextDouble();

        quantidade_caixas = (bolas_produzidas - bolas_defeito) / caixa_de_papelao;
        quantidade_caixas = Math.ceil(quantidade_caixas);
        vlr_total_emb = quantidade_caixas * vlr_caixas;

        if (quantidade_caixas > galpao_armazem) {
            quantidade_galpoes = quantidade_caixas / galpao_armazem;
            quantidade_galpoes = Math.ceil(quantidade_galpoes);
        }

        vlr_total_estoque = (vlr_aluguel * quantidade_galpoes) * meses_copa;
        vlr_total = vlr_total_emb + vlr_total_estoque;

        System.out.println("O custo total é: " + vlr_total);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes