package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13EX11 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        List<Double> imposto = new ArrayList<Double>();

        String nome, temp_nome;
        double salario, temp_imposto;
        int quantidade_dependentes;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            if (nome.equalsIgnoreCase("X")) {
                break;
            }
            System.out.print("Digite seu salario: R$");
            salario = sc.nextDouble();
            System.out.print("Digite a quantidade de dependentes: ");
            quantidade_dependentes = sc.nextInt();
            sc.nextLine();
            nomes.add(nome);
            imposto.add(C13EX11_class.CalculaIRPF(salario,quantidade_dependentes));
        } while (!nome.equalsIgnoreCase("X"));

        for (int i = 0; i < nomes.size(); i++){
            for (int x = 0; x < nomes.size() - 1; x++){
                if (nomes.get(x).compareToIgnoreCase(nomes.get(x+1)) > 0){
                    temp_nome = nomes.get(x);
                    nomes.set(x,nomes.get(x+1));
                    nomes.set(x+1,temp_nome);
                    temp_imposto = imposto.get(x);
                    imposto.set(x,imposto.get(x+1));
                    imposto.set(x+1,temp_imposto);
                }
            }
        }

        for (int z = 0; z < nomes.size(); z++){
            System.out.println("Nome - "+nomes.get(z)+" / Imposto - R$"+imposto.get(z));
        }

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes