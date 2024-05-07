package Etapa2;

import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeFuncionario, nomeSalarioMaximo ="";
        int horaTrabalhada=0, premioProdutividade, faixaProdutividade, contador100=0, contador500=0, contador500Mais=0, horasCompletas=0, totalhoras=0, somaTotal=0;
        double salario = 0, salarioMaximo =0, mediaHorasTrabalhadas;

        do {
            System.out.print("Informe o nome do funcionário (ou 'FIM' para sair): ");
            nomeFuncionario = scanner.nextLine();

            if (nomeFuncionario.equalsIgnoreCase("FIM"))
                break;

            System.out.print("Informe a quantidade de horas trabalhadas pelo funcionário: ");
            horaTrabalhada = scanner.nextInt();
            totalhoras++;
            scanner.nextLine(); // Limpar o buffer do scanner

            if (horaTrabalhada <= 100) {
                premioProdutividade = 1000;
            } else if (horaTrabalhada <= 500) {
                premioProdutividade = horaTrabalhada * 10;
            } else {
                horasCompletas = horaTrabalhada / 10;
                premioProdutividade = horasCompletas * 100;
            }

            System.out.println("O prêmio de produtividade para o funcionário " + nomeFuncionario + " é: R$" + premioProdutividade);
            if (horaTrabalhada <=100)
                contador100++;
            if (horaTrabalhada<=500)
                contador500++;
            else
                contador500Mais++;

            double salarioTotal = salario + premioProdutividade;
            somaTotal += salarioTotal;

            System.out.println("O prêmio de produtividade para o funcionário " + nomeFuncionario + " é: R$" + premioProdutividade);
            System.out.println("Nome: " + nomeFuncionario);
            System.out.println("Salário a receber: R$" + salarioTotal);
            System.out.println();

            // Verifica o maior salário
            if (salarioTotal > salarioMaximo) {
                salarioMaximo = salarioTotal;
                nomeSalarioMaximo = nomeFuncionario;
            }

        } while (true);

        // Calcula média de horas trabalhadas por pessoa no projeto
        mediaHorasTrabalhadas =  somaTotal / totalhoras;

        // Imprime resultados finais
        System.out.println("Média de horas trabalhadas por pessoa no projeto: " + mediaHorasTrabalhadas);
        System.out.println("Funcionário com maior salário: " + nomeSalarioMaximo);
        System.out.println("Quantidade de pessoas por faixa do prêmio de produtividade:");
        System.out.println("Até 100 horas: " + contador100);
        System.out.println("De 101 a 500 horas: " + contador500);
        System.out.println("Mais de 500 horas: " + contador500Mais);
        System.out.println("Valor total da folha de pagamento: R$" + somaTotal);

        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes