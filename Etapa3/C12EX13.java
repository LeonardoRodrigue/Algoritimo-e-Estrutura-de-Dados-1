package Etapa3;

import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {
        String nome[] = new String[10];
        int posicao[] = new int[10];
        String nome_procurado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nomes das pessoas que estão na fila");

        for (int i = 0; i < nome.length; i++){
            System.out.print("Digite o nome: ");
            nome[i] = sc.nextLine();
            posicao[i] = i + 1;
        }

        System.out.print("Digite o nome da pessoa para saber sua posição na fila: ");
        nome_procurado = sc.nextLine();

        for (int i = 0; i < nome.length; i++){
            if (nome[i].equalsIgnoreCase(nome_procurado)){
                System.out.println("Ele(a) esta na "+posicao[i]+"º posição na fila.");
            } else if (i == (nome.length - 1) && !nome[i].equalsIgnoreCase(nome_procurado)){
                System.out.println("Não esta na fila.");
            }
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes