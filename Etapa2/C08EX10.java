package Etapa2;

import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        int quant_insumos;
        double quantidade, preco, media, custo_parcial, custo_parcial_maior = 0, custo_total = 0;
        String nome, nome_maior = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de insumos --> ");
        quant_insumos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quant_insumos; i++){
            System.out.print("Digite o nome do insumo --> ");
            nome = sc.nextLine();
            System.out.print("Digite a quantidade deste insumo --> ");
            quantidade = sc.nextDouble();
            System.out.print("Digite o preço de cada quantidade --> ");
            preco = sc.nextDouble();
            sc.nextLine();
            custo_parcial = quantidade * preco;
            custo_total += custo_parcial;

            if(i == 1 || custo_parcial > custo_parcial_maior){
                custo_parcial_maior = custo_parcial;
                nome_maior = nome;
            }
        }
        media = custo_total / quant_insumos;
        System.out.println("O custo total foi de --> "+custo_total);
        System.out.println("A média dos custos parciais é --> "+media);
        System.out.println("O nome do insumo de maior custo parcial é --> "+nome_maior);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes