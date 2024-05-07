package Etapa1;
import java.util.Scanner;

public class C04EX01 {
    public static void main(String[] args) {
        String nome_inic, nome_mei, nome_fin;
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        nome_inic = sc.nextLine();
        System.out.print("Digite seu nome do meio: ");
        nome_mei = sc.nextLine();
        System.out.print("Digite seu ultimo nome: ");
        nome_fin = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println(nome_fin+", "+nome_inic+" "+nome_mei);
        System.out.println("Idade: " +idade+" anos.");

        sc.close();
    }
}

//Leonardo Rodrigues Reis Lopes