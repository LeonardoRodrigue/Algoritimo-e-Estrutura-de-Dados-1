package Etapa2;

import java.util.Scanner;

public class C11EX02B {
    public static void main(String[] args) {
        int cont_bronze = 0, cont_prata = 0, cont_ouro = 0;
        double valor_aplicado, media, soma_bronze = 0, soma_total = 0, menor_aplicacao = 99999;
        String nome, nome_menor_aplicacao = "", classificacao;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            if(nome.equalsIgnoreCase("Reynaldo Duarte")){
                break;
            }
            System.out.print("Digite o valor a ser aplicado: ");
            valor_aplicado = sc.nextDouble();
            sc.nextLine();

            if (valor_aplicado <= 1000) {
                classificacao = "Bronze";
                cont_bronze++;
                soma_bronze += valor_aplicado;
            } else if (valor_aplicado <= 5000) {
                classificacao = "Prata";
                cont_prata++;
            } else {
                classificacao = "Ouro";
                cont_ouro++;
            }

            soma_total += valor_aplicado;
            System.out.println(nome + " é classificação " + classificacao);

            if (valor_aplicado < menor_aplicacao) {
                nome_menor_aplicacao = nome;
                menor_aplicacao = valor_aplicado;
            }
        } while (!nome.equalsIgnoreCase("Reynaldo Duarte"));
        media = soma_bronze / cont_bronze;
        System.out.println("Total de Bronze = "+cont_bronze);
        System.out.println("Total de Prata = "+cont_prata);
        System.out.println("Total de Ouro = "+cont_ouro);
        System.out.println("Média das aplicações dos clientes Bronze = R$"+media);
        System.out.println("Volume total das aplicações = R$"+soma_total);
        System.out.println("Nome do aplicador de menor aplicação = "+nome_menor_aplicacao);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes