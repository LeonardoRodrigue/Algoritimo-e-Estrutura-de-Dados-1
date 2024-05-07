package Etapa2;

import java.util.Scanner;

public class C08EX09 {
    public static void main(String[] args) {
        String nome, sexo;
        int idade, soma_homens = 0, soma_mulheres = 0, quant_homens = 0, quant_mulheres = 0,repeticoes;
        double media_mulheres = 0, media_homens = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quntidade de pessoas a ser lida: ");
        repeticoes = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= repeticoes; i++) {
            System.out.print("Digite o nome da pessoa --> ");
            nome = sc.nextLine();
            System.out.print("Digite a idade --> ");
            idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o sexo da pessoa, 'F' - feminino e 'M' - masculino --> ");
            sexo = sc.nextLine();

            switch (sexo){
                case "F": case "f":
                    soma_mulheres += idade;
                    quant_mulheres++;
                    break;
                case "M": case "m":
                    soma_homens += idade;
                    quant_homens++;
                    break;
                default:
                    System.out.println("Digite um sexo válido!");
                    break;
            }
        }
        media_mulheres = soma_mulheres / quant_mulheres;
        media_homens = soma_homens / quant_homens;
        System.out.println("A média das idades dos homens é = "+media_homens);
        System.out.println("A média das idades das mulheres é = "+media_mulheres);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes