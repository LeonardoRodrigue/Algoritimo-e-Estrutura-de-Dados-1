package Etapa1;
import java.util.Scanner;

public class C04EX03 {
    public static void main(String[] args) {
        double valor1, valor2, valor3;
        int quant1, quant2, quant3;
        String linha = "--------------------------------------------------------";
        String borda = "========================================================";

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade maxima para a primeira multa: ");
        quant1 = sc.nextInt();
        System.out.print("Digite o valor da segunda multa: ");
        valor1 = sc.nextDouble();
        System.out.print("Digite a quantidade maxima para a segunda multa: ");
        quant2 = sc.nextInt();
        System.out.print("Digite o valor da segunda multa: ");
        valor2 = sc.nextDouble();
        System.out.print("Digite a quantidade maxima para a terceira multa: ");
        quant3 = sc.nextInt();
        System.out.print("Digite o valor da segunda multa: ");
        valor3 = sc.nextDouble();

        System.out.println(borda);
        System.out.println("      Quantidade de Poluente Emitido x Valor Multa      ");
        System.out.println(linha);
        System.out.println("Até "+quant1+" multa de R$"+valor1);
        System.out.println(linha);
        System.out.println("Acima de "+quant2+" até "+quant3+" multa de R$"+valor2);
        System.out.println(linha);
        System.out.println("Acima de "+quant3+" multa de R$"+valor3+" por poluente emitido");
        System.out.println(borda);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes