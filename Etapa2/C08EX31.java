package Etapa2;

import java.util.Scanner;

public class C08EX31 {
    public static void main(String[] args) {
        double salario, salario_minimo, soma_adm = 0, media_adm, menor_salario = 999999;
        int quantidade_engenheiros, cont_maior = 0, cont_adm = 0, cont_outros = 0;
        String nome, nome_menor = "", codigo_cargo, cargo_menor_salario = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de engenheiros a serem pesquisados: ");
        quantidade_engenheiros = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= quantidade_engenheiros; i++) {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.print("Digite seu salario bruto: ");
            salario = sc.nextDouble();
            sc.nextLine();
            System.out.print("Digite seu cargo (C - Engenheiro Calculista, P - Engenheiro Projetista, O - Engenheiro de Obra, A - Engenheiro Administrador, X - Outros): ");
            codigo_cargo = sc.nextLine();

            switch (codigo_cargo) {
                case "C": case "c":
                    salario_minimo = 2.500;
                    if (salario < salario_minimo){
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                    }
                    if (salario >= salario_minimo){
                        cont_maior++;
                    }
                    break;
                case "P": case "p":
                    salario_minimo = 4.650;
                    if (salario < salario_minimo){
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                    }
                    if (salario >= salario_minimo){
                        cont_maior++;
                    }
                    break;
                case "O": case "o":
                    salario_minimo = 3.200;
                    if (salario < salario_minimo){
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                    }
                    if (salario >= salario_minimo){
                        cont_maior++;
                    }
                    break;
                case "A": case "a":
                    salario_minimo = 5.100;
                    cont_adm++;
                    soma_adm += salario;
                    if (salario < salario_minimo){
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                    }
                    if (salario >= salario_minimo){
                        cont_maior++;
                    }
                    break;
                case "X": case "x":
                    salario_minimo = 0;
                    if (salario > 5000){
                        cont_outros++;
                    }
                    break;
                default:
                    System.out.println("Digite um codigo para um cargo válido!");
                    return;
            }

            if (i == 1 || salario < menor_salario){
                nome_menor = nome;
                menor_salario = salario;
                cargo_menor_salario = codigo_cargo;
                if (cargo_menor_salario.equalsIgnoreCase("C") || cargo_menor_salario.equalsIgnoreCase("c")){
                    cargo_menor_salario = "Engenheiro Calculista";
                } else if (cargo_menor_salario.equalsIgnoreCase("P") || cargo_menor_salario.equalsIgnoreCase("p")){
                    cargo_menor_salario = "Engenheiro Projetista";
                } else if (cargo_menor_salario.equalsIgnoreCase("O") || cargo_menor_salario.equalsIgnoreCase("o")){
                    cargo_menor_salario = "Engenheiro de Obra";
                } else if (cargo_menor_salario.equalsIgnoreCase("A") || cargo_menor_salario.equalsIgnoreCase("a")){
                    cargo_menor_salario = "Engenheiro Administrador";
                } else if (cargo_menor_salario.equalsIgnoreCase("X") || cargo_menor_salario.equalsIgnoreCase("x")){
                    cargo_menor_salario = "Outros";
                }
            }
        }
        media_adm = soma_adm / cont_adm;
        System.out.println("Média dos salários dos Administradores = R$"+media_adm);
        System.out.println("Quantidade de salários acima do mínimo = "+cont_maior);
        System.out.println("Quantidade de engenheiros de cargo 'Outros' que recebem acima de R$5000 = "+cont_outros);
        System.out.println("Nome, cargo e salário do engenheiro de menor salário = "+nome_menor+", "+cargo_menor_salario+", R$"+menor_salario);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes