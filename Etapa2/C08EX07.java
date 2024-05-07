package Etapa2;

import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args) {
        String nome;
        int idade, cont = 0, cont_menor = 0, cont_maior = 0;
        double media, soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            System.out.print("Digite o nome do aluno: ");
            nome = sc.nextLine();
            System.out.print("Digite a idade do aluno: ");
            idade = sc.nextInt();
            sc.nextLine();

            if (idade <= 12){
                cont_menor++;
            } else if (idade > 30) {
                cont_maior++;
            }
            cont++;
            soma += idade;
        }

        media = soma / cont;
        System.out.println("A quantidade de alunos que tem até 12 anos é: "+cont_menor);
        System.out.println("A quantidade de alunos que tem acima de 30 anos é: "+cont_maior);
        System.out.println("A media das idades informadas é: "+media);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes