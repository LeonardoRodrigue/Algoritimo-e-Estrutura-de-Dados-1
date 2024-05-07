package Etapa2;

import java.util.Scanner;

public class C11EX04B {
    public static void main(String[] args) {
        double valor_multa, media_idades, total_multas = 0, percentual;
        int idade, idade_mais_velho = 999, quant_pontos, cont_mulheres = 0, cont_homens = 0, cont_idades = 0, soma_idades = 0;
        String nome, nome_mais_velho = "", sexo;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o nome do infrator: ");
            nome = sc.nextLine();
            if (nome.equalsIgnoreCase("X")){
                break;
            }
            System.out.print("Digite a idade do infrator: ");
            idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o sexo do infrator(M - Masculino / F - Feminino): ");
            sexo = sc.nextLine();
            System.out.print("Digite a quantidade de pontos perdidos na carteira: ");
            quant_pontos = sc.nextInt();
            System.out.print("Digite o valor da multa: ");
            valor_multa = sc.nextDouble();
            sc.nextLine();

            soma_idades+=idade;
            cont_idades++;
            total_multas+=valor_multa;

            if(sexo.equalsIgnoreCase("M")){
                cont_homens++;
            }
            if(sexo.equalsIgnoreCase("F") && quant_pontos >= 7){
                cont_mulheres++;
            }
            if (idade < idade_mais_velho){
                idade_mais_velho = idade;
                nome_mais_velho = nome;
            }
        } while (!nome.equalsIgnoreCase("X"));
        media_idades = soma_idades / cont_idades;
        percentual = cont_homens / 230;
        System.out.println("Idade média dos condutores = "+media_idades);
        System.out.println("Valor total das multas aplicadas = R$"+total_multas);
        System.out.println("Percentual de homens multados = "+percentual);
        System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira = "+cont_mulheres);
        System.out.println("Nome e idade da pessoa mais velha = "+nome_mais_velho+" "+idade_mais_velho);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes