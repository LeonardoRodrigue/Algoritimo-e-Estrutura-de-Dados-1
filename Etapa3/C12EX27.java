package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {
        List<Integer> cpf = new ArrayList<>();
        List<String> endereco = new ArrayList<>();
        String endereco_informado, incluir, novo_endereco;
        int numero_cpf, cpf_procurado, pergunta = 0, posicao = -1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o numero do CPF(APENAS NUMEROS): ");
            numero_cpf = sc.nextInt();
            sc.nextLine();
            if (numero_cpf == 0){
                break;
            }
            System.out.print("Digite o endereço: ");
            endereco_informado = sc.nextLine();
            cpf.add(numero_cpf);
            endereco.add(endereco_informado);
        } while (numero_cpf != 0);

        System.out.print("Digite um CPF que deseja procurar(APENAS NUMEROS): ");
        cpf_procurado = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cpf.size(); i++){
            if (cpf.get(i) == cpf_procurado){
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("CPF não encontrado na lista!");
            System.out.print("Deseja incluir na lista? S/N: ");
            incluir = sc.nextLine();
            if (incluir.equalsIgnoreCase("S")){
                System.out.print("Digite o novo endereço: ");
                novo_endereco = sc.nextLine();
                cpf.add(cpf_procurado);
                endereco.add(novo_endereco);
            }
        } else {
            System.out.println("CPF encontrado na posição "+(posicao+1));
            System.out.print("Deseja alterar o endereço dele ou excluir ele da lista? (1 - Alterar / 2 - Excluir / 3 - Sair): ");
            pergunta = sc.nextInt();
            switch (pergunta){
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o novo endereço: ");
                    novo_endereco = sc.nextLine();
                    endereco.set(posicao,novo_endereco);
                    break;
                case 2:
                    endereco.remove(posicao);
                    cpf.remove(posicao);
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < cpf.size(); i++){
            System.out.println(cpf.get(i)+" esta vinculado ao endereço "+endereco.get(i));
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes