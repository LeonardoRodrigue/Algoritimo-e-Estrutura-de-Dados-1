package Etapa1;

import java.util.Scanner;

public class C06EX10 {
    public static void main(String[] args) {
        
        double vlr_aplicado, taxa_diaria, rendimento, imp_renda, vlr_resgatado, taxa_IR = 0.15;
        int num_dias, taxa_administa = 10;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o capital que foi aplicado: ");
        vlr_aplicado = sc.nextDouble();
        System.out.print("Digite o numero de dias que ficou apicado: ");
        num_dias = sc.nextInt();
        System.out.print("Digite o valor da taxa diaria: ");
        taxa_diaria = sc.nextDouble() / 100;
        
        rendimento = vlr_aplicado * taxa_diaria * num_dias;
        imp_renda = rendimento * taxa_IR;
        vlr_resgatado = vlr_aplicado + rendimento - imp_renda - taxa_administa;

        System.out.println("Valor a ser resgatado: " + vlr_resgatado);
        System.out.println("Rendimento: " + rendimento + "%");
        System.out.println("Imposto de renda: " + imp_renda);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes