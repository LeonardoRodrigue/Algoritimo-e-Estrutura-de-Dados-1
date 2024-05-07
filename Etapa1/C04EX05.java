package Etapa1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class C04EX05 {
    public static void main(String[] args) {
        String nome, cpf, identidade, nome_emp;
        int titulo_eleitor, carteira_mot;
        double salario;

        Scanner arq = new Scanner(C04EX05.class.getResourceAsStream("ficha.txt"));
        nome = arq.nextLine();
        cpf = arq.nextLine();
        identidade = arq.nextLine();
        titulo_eleitor = arq.nextInt();
        carteira_mot = arq.nextInt();
        arq.nextLine();
        nome_emp = arq.nextLine();
        salario = arq.nextDouble();

        JOptionPane.showMessageDialog(null,
                "\nFICHA FUNCIONAL DE: "+nome+
                        "\nDocumentos:"+
                        "\nCPF .......................................... "+cpf+
                        "\nC.I. ............................................ "+identidade+
                        "\nTitulo de eleitor  ..................... "+titulo_eleitor+
                        "\nCarteira de motorista ............. "+carteira_mot+
                        "\n\nEmpresa: "+nome_emp+
                        "\nSalario: "+salario,
                "Ficha Funcional",
                JOptionPane.INFORMATION_MESSAGE);

        arq.close();
    }
}

// Leonardo Rodrigues Reis Lopes