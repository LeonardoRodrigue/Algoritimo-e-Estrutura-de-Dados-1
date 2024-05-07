package Etapa2;

import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args) {
        double valor_recebido, media, total = 0;
        int cont_acima10000 = 0, cont = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um valor recebido: ");
            valor_recebido = sc.nextDouble();
            if (valor_recebido == 0){
                break;
            }
            cont++;
            total += valor_recebido;
            if (valor_recebido > 1000){
                cont_acima10000++;
            }
        } while (valor_recebido != 0);
        media = total / cont;
        System.out.println("Valor total recebido = R$"+total);
        System.out.println("Média dos valores recebidos = R$"+media);
        System.out.println("Quantidade de valores acima de R$1000,00 = "+cont_acima10000);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes