package Etapa2;

import java.util.Scanner;

public class C11EX05 {
    public static void main(String[] args) {
        int codigo, cont = 0, cont_ingles = 0;
        double valor, media, soma = 0, soma_ingles = 0, soma_frances = 0, soma_espanhol = 0;
        String nome, curso;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            if (nome.equalsIgnoreCase("FIM")){
                break;
            }
            System.out.print("Digite o codigo referente ao seu curso (1 - Inglês / 2 - Francês / 3 - Espanhol): ");
            codigo = sc.nextInt();
            sc.nextLine();
            switch (codigo){
                case 1:
                    valor = 100;
                    curso = "Inglês";
                    soma_ingles+=valor;
                    cont_ingles++;
                    break;
                case 2:
                    valor = 150;
                    curso = "Francês";
                    soma_frances+=valor;
                    break;
                case 3:
                    valor = 120;
                    curso = "Espanhol";
                    soma_espanhol+=valor;
                    break;
                default:
                    System.out.println("Digite um numero válido (1 - Inglês / 2 - Francês / 3 - Espanhol)!");
                    return;
            }
            System.out.println("Aluno "+nome+" matriculado no curso de "+curso+" com o valor de R$"+valor);
            soma += valor;
            cont++;
        } while (!nome.equalsIgnoreCase("FIM"));
        media = soma / cont;
        System.out.println("A quantidade de alunos matriculados nas turmas de Inglês = "+cont_ingles);
        System.out.println("A mensalidade média da escola = R$"+media);
        System.out.println("O valor total das mensalidades por opção\nInglês = R$"+soma_ingles+", Francês = R$"+soma_frances+"e Espanhol = R$"+soma_espanhol);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes