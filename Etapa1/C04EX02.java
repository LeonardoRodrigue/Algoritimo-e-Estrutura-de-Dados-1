package Etapa1;
import java.util.Scanner;

public class C04EX02 {
    public static void main(String[] args) {
        String nome, cpf, identidade, nome_emp;
        int titulo_eleitor, carteira_mot;
        double salario;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite seu cpf: ");
        cpf = sc.nextLine();
        System.out.print("Digite o numero da carteira de identidade: ");
        identidade = sc.nextLine();
        System.out.print("Digite o numero do titulo de eleito: ");
        titulo_eleitor = sc.nextInt();
        System.out.print("Digite o numero da carteira de motorista: ");
        carteira_mot = sc.nextInt();
        System.out.print("Digite o nome da empresa que você trabalha: ");
        nome_emp = sc.nextLine();
        System.out.print("Digite o seu salario: ");
        salario = sc.nextDouble();

        System.out.printf("\nFICHA FUNCIONAL DE: "+nome);
        System.out.println("\nDocumentos:");
        System.out.print("CPF ............................................. "+cpf);
        System.out.print("\nC.I. ............................................ "+identidade);
        System.out.print("\nTitulo de eleitor  .............................. "+titulo_eleitor);
        System.out.print("\nCarteira de motorista ........................... "+carteira_mot);
        System.out.print("\n\nEmpresa: "+nome_emp);
        System.out.printf("\nSalario: R$%.2f%n",salario);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes