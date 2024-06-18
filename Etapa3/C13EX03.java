package Etapa3;

import java.util.Scanner;

public class C13EX03 {
    public static void main(String[] args) {
        int numero, posicao;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro qualquer (de 0 até 999999999): ");
        numero = sc.nextInt();
        System.out.print("Digite a posição do digito que você deseja: ");
        posicao = sc.nextInt();

        System.out.println("O caracter na posição "+posicao+" é o "+pegar_posicao(numero, posicao));
        sc.close();
    }
    static int pegar_posicao(int numero, int posicao){
        int numero_procurado;
        numero_procurado = (int) (numero % Math.pow(10,posicao) % 10);
        return numero_procurado;
    }
}

// Leonardo Rodrigues Reis Lopes