package Etapa2;

import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nomeFuncionario, primeiroFuncionario = "", ultimoFuncionario = "";
        int setorMaisFuncionarios = 0, funcionariosAdm10 = 0, quantFuncionarios = 0, RF, anoAdmissao = 0, setorTrabalhado = 0, ordemAdmissao = 0, contador10 = 0, contadorGerencia = 0, contadorAdm = 0, contadorPesquisa = 0, contadorObras = 0;

        do {
            System.out.print("Informe o nome do funcionário (ou 'FIM' para sair): ");
            nomeFuncionario = scanner.nextLine();

            if (nomeFuncionario.equalsIgnoreCase("FIM"))
                break;

            System.out.print("Informe o seu RF: ");
            RF = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente
            anoAdmissao = RF / 1000;
            setorTrabalhado = (RF / 100) % 10;
            ordemAdmissao = RF % 100;

            if (anoAdmissao < 10 || anoAdmissao > 14 || setorTrabalhado < 1 || setorTrabalhado > 4 || RF < 100000 || RF > 999999) {
                System.out.println("REGISTRO INVÁLIDO");
                continue;
            }

            // Contagem de funcionários por setor
            if (setorTrabalhado == 1)
                contadorGerencia++;
            else if (setorTrabalhado == 2)
                contadorAdm++;
            else if (setorTrabalhado == 3)
                contadorPesquisa++;
            else if (setorTrabalhado == 4)
                contadorObras++;

            // Contagem de funcionários admitidos em 2010 e que trabalham na Administração
            if (anoAdmissao == 10 && setorTrabalhado == 2) {
                funcionariosAdm10++;
            }

            quantFuncionarios = contadorAdm + contadorGerencia + contadorObras + contadorPesquisa;

            // Verifica o setor com mais funcionários:
            if (quantFuncionarios > setorMaisFuncionarios) {
                setorMaisFuncionarios = quantFuncionarios;
            }

            // Identifica o primeiro e o último funcionário
            if (contador10 == 1) {
                primeiroFuncionario = nomeFuncionario;
            }
            ultimoFuncionario = nomeFuncionario;

            contador10++;

        } while (true);

        // Imprime os resultados
        System.out.println("O setor de pesquisa possui " + contadorPesquisa + " funcionários");
        System.out.println("O setor da administração possui " + contadorAdm + " funcionários");
        System.out.println("O setor de obra possui " + contadorObras + " funcionários");
        System.out.println("O setor da gerência possui " + contadorGerencia + " funcionários");
        System.out.println("A quantidade de funcionários admitidos em 2010 e que trabalham na Administração são " + funcionariosAdm10);
        System.out.println("O setor que possui o maior número de funcionários é " + setorMaisFuncionarios);
        System.out.println("O primeiro funcionário admitido na empresa é: " + primeiroFuncionario);
        System.out.println("O último funcionário admitido na empresa é: " + ultimoFuncionario);

        scanner.close();
    }
}

// Leonardo Rodrigues Reis Lopes