package Etapa1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class C07EX06 {
    public static void main(String[] args) {
        int tipo, frm_pag, preco_por_kg;
        double quantidade, preco_total = 0, desconto = 0, vlr_pagar;
        String tipo_carne = null, forma_de_pag = null;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de carne que você ira levar: \n1 - File Duplo   2 - Alcatra   3 - Picanha\n");
        tipo = sc.nextInt();
        System.out.print("Informe a quantidade de carne que irá levar (em KG): ");
        quantidade = sc.nextDouble();
        System.out.print("Selecione a forma de pagamento\n1 - Dinheiro   2 - Cartão Credito/Debito   3 - Pix   4 - Cartão Tabajara\n");
        frm_pag = sc.nextInt();

        if (quantidade <= 5){
            preco_por_kg = 1;
        } else {
            preco_por_kg = 2;
        }

        switch (tipo){
            case 1:
                switch (preco_por_kg){
                    case 1:
                        preco_total = quantidade * 4.9;
                        break;
                    case 2:
                        preco_total = quantidade * 5.8;
                }
                tipo_carne = "FILE DUPLO";
                break;
            case 2:
                switch (preco_por_kg){
                    case 1:
                        preco_total = quantidade * 5.9;
                        break;
                    case 2:
                        preco_total = quantidade * 6.8;
                }
                tipo_carne = "ALCATRA";
                break;
            case 3:
                switch (preco_por_kg){
                    case 1:
                        preco_total = quantidade * 6.9;
                        break;
                    case 2:
                        preco_total = quantidade * 7.8;
                }
                tipo_carne = "PICANHA";
                break;
        }

        switch (frm_pag){
            case 1:
                desconto = 0;
                forma_de_pag = "DINHEIRO";
                break;
            case 2:
                desconto = 0;
                forma_de_pag = "CARTÃO CREDITO/DEBITO";
                break;
            case 3:
                desconto = 0;
                forma_de_pag = "PIX";
                break;
            case 4:
                desconto = preco_total * 0.05;
                forma_de_pag = "CARTÃO TABAJARA";
                break;
        }

        vlr_pagar = preco_total + desconto;

        JOptionPane.showMessageDialog(null,
                "NOTA FISCAL COMSUMIDOR ELETRONICO\n"+
                "\nTIPO DE CARNE: "+ tipo_carne +
                "\nQUANTIDADE DE CARNE: " + quantidade + " KG" +
                "\nPREÇO TOTAL: R$" +preco_total +
                "\nFORMA DE PAGAMENTO: " + forma_de_pag +
                "\nDESCONTO: R$" + desconto +
                "\n VALOR A PAGAR: R$" + vlr_pagar,
                "NFCE", JOptionPane.INFORMATION_MESSAGE
        );
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes