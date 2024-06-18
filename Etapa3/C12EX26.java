package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        List<Double> salario = new ArrayList<Double>();
        String nome_funcionario;
        double salario_funcionario, salario_reajustado, reajuste;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o nome do funcionario: ");
            nome_funcionario = sc.nextLine();
            if (nome_funcionario.equalsIgnoreCase("X")){
                break;
            }
            System.out.print("Digite o salario do funcionario: ");
            salario_funcionario = sc.nextDouble();
            sc.nextLine();
            nomes.add(nome_funcionario);
            salario.add(salario_funcionario);
        } while (!nome_funcionario.equalsIgnoreCase("X"));

        System.out.print("Digite um indice para ajuste salarial de todos os funcionario, em porcentragem: ");
        reajuste = sc.nextInt();

        for (int i = 0; i < salario.size(); i++){
            if (salario.get(i) < 1000) {
                salario_reajustado = salario.get(i) + salario.get(i) * (reajuste / 100);
                salario.set(i,salario_reajustado);
            }

        }
        for (int i = 0; i < salario.size(); i++){
            System.out.println(nomes.get(i)+" possui o salario de R$"+salario.get(i));
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes