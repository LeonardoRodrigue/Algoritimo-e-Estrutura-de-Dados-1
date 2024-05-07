package Etapa2;

import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        String nome, maior_nome = "";
        double salario, maior_salario = 0, media, soma_salarios = 0;
        int idade, quant_menor_18 = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.print("Digite o seu nome: ");
            nome = sc.nextLine();
            System.out.print("Digite seu salario: ");
            salario = sc.nextDouble();
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();

            if (salario > 10000 && idade > 50){
                System.out.println("Funcionario SÊNIOR");
            }
            if (idade <= 18){
                soma_salarios += salario;
                quant_menor_18++;
            }
            if (i == 1 || salario > maior_salario){
                maior_nome = nome;
                maior_salario = salario;
            }
            sc.nextLine();
        }
        media = soma_salarios / quant_menor_18;
        System.out.println("A media dos salarios dos funcionario de ate 18 anos é = R$"+media);
        System.out.println("O nome do funcionario com maior salario é "+maior_nome+ "e o seu salario é R$"+maior_salario);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes