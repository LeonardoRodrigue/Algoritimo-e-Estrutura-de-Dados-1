package Etapa2;

import java.util.Scanner;

public class C11EX03 {
    public static void main(String[] args) {
        double multa, soma = 0;
        int dia, pontos, cont_8 = 0;
        String placa;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o dia da multa: ");
            dia = sc.nextInt();
            if (dia == 99){
                break;
            }
            sc.nextLine();
            System.out.print("Digite a placa do veiculo: ");
            placa = sc.nextLine();
            System.out.print("Digite a quantidade de pontos dessa multa (3 - 5 - 8): ");
            pontos = sc.nextInt();

            switch (pontos){
                case 3:
                    multa = 42;
                    break;
                case 5:
                    multa = 108;
                    break;
                case 8:
                    multa = 479;
                    if (dia <= 15){
                        cont_8++;
                    }
                    break;
                default:
                    System.out.println("Digite um valor de pontos válidos! (3 - 5 - 8)");
                    return;
            }
            System.out.println("Multa aplicada no dia "+dia+", na placa "+placa+" com a pontuação de "+pontos+" pontos e o valor de R$"+multa);
            soma+=multa;
        } while (dia != 99);

        System.out.println("A quantidade de multas de pontuação 8 da primeira quinzena do mês = "+cont_8);
        System.out.println("O valor total arrecadado com as multas = R$"+soma);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes