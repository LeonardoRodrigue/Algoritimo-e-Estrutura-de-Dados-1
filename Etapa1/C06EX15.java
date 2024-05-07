package Etapa1;

import java.util.Scanner;

public class C06EX15 {
    public static void main(String[] args) {
        int codigo, quant_dias;
        double vlr_extra, conta, imp_cidade, tot_dias, imposto, diarias = 0, vlr_fixo = 0;
        String cidade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o codigo do seu plano (1 - Basic / 2 - Advanced / 3 - Premium): ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade de dias de uso do Pay-Per-View: ");
        quant_dias = sc.nextInt();
        System.out.print("Digite o valor dos serviços extras: ");
        vlr_extra = sc.nextDouble();
        System.out.print("Digite o nome da sua cidade: ");
        sc.nextLine();
        cidade = sc.nextLine();

        switch (codigo) {
            case 1:
                vlr_fixo = 65;
                diarias = 1.20;
                break;
            case 2:
                vlr_fixo = 104;
                diarias = 2.10;
                break;
            case 3:
                vlr_fixo = 137;
                diarias = 0;
                break;
            default:
                break;
        }

        switch (cidade) {
            case "Belo Horizonte":
                imp_cidade = 0;
                break;
            case "Sao Paulo":
                imp_cidade = 0.01;
                break;
            case "Rio de Janeiro":
                imp_cidade = 0.015;
            default:
                imp_cidade = 0.02;
                break;
        }

        tot_dias = diarias * quant_dias;
        imposto = (vlr_fixo + tot_dias + vlr_extra) * imp_cidade;

        if (codigo == 1){
            if (tot_dias > 65) {
                tot_dias = 65;
            }
        }

        conta = vlr_fixo + tot_dias + vlr_extra + imposto;
        
        System.out.println("O valor total da sua conta é: " + conta);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes
