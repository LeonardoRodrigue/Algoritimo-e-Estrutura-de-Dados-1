//package Etapa1;

import java.util.Scanner;

public class C05EX15 {
    public static void main(String[] args) {
        double cx_papelao = 7, cx_madeira = 15, caminhao = 50;
        double eucaliptos, producao, perdas, quant_cx_papelao, quant_cx_madeira, quant_caminhoes;
        double vlr_papelao, vlr_total_papelao, vlr_madeira, vlr_total_madeira, vlr_frete, vlr_total_frete, custo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade da produção: ");
        producao = sc.nextDouble();
        System.out.print("Digite a quantidade de perdas: ");
        perdas = sc.nextDouble();
        System.out.print("Digite o valor da caixa de papelão: ");
        vlr_papelao = sc.nextDouble();
        System.out.print("Digite o valor recebido por cada madeira: ");
        vlr_madeira = sc.nextDouble();
        System.out.print("Digite o valor do frete: ");
        vlr_frete = sc.nextDouble();

        eucaliptos = producao - perdas;
        quant_cx_papelao = eucaliptos / cx_papelao;
        quant_cx_papelao = Math.ceil(quant_cx_papelao);
        quant_cx_madeira = quant_cx_papelao / cx_madeira;
        quant_cx_madeira = Math.ceil(quant_cx_madeira);
        quant_caminhoes = quant_cx_madeira / caminhao;
        quant_caminhoes = Math.ceil(quant_caminhoes);

        vlr_total_papelao = quant_cx_papelao * vlr_papelao;
        vlr_total_madeira = quant_cx_madeira * vlr_madeira;
        vlr_total_frete = quant_caminhoes * vlr_frete;
        
        custo = vlr_total_papelao + vlr_total_madeira + vlr_total_frete;

        System.out.println("O custo total é: " + custo);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes