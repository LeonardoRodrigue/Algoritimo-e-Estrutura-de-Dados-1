package Etapa3;
import javax.swing.JOptionPane;

public class C12EX24 {
    public static void main(String[] args) {

        int pontuacao [] = new int [20];
        String nome [] = new String [20];
        String saida = "";

        for (int aux = 0; aux < pontuacao.length; aux++) {
            nome[aux] = JOptionPane.showInputDialog(null, "Digite o nome da equipe: ");
            pontuacao[aux] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a pontuação da equipe: "));

        }

        for (int aux = 0; aux < pontuacao.length; aux++) {
            for (int aux2 = aux + 1; aux2 < pontuacao.length; aux2++) {
                if (pontuacao[aux2] > pontuacao[aux]) {
                    int tempPontos = pontuacao[aux];
                    pontuacao[aux] = pontuacao[aux2];
                    pontuacao[aux2] = tempPontos;

                    String tempNome = nome[aux];
                    nome[aux] = nome[aux2];
                    nome[aux2] = tempNome;
                }
            }
        }
        String input = JOptionPane.showInputDialog(null, "Digite o nome da equipe: ");

        for (int aux = 0; aux < pontuacao.length; aux++) {
            if (nome[aux].equalsIgnoreCase(input)) {
                String situacao;
                if (aux <= 4) {
                    situacao = "Copa Libertadores";
                } else if (aux <= 12) {
                    situacao = "Copa Sul-Americana";
                } else if (aux <= 16) {
                    situacao = "Permanece na serie A";
                } else {
                    situacao = "Rebaixado";
                }
                JOptionPane.showMessageDialog(null, "A equipe " + input + " ficou na posição " + (aux + 1) + " e sua situação é: " + situacao);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Não foi encontrado a equipe. ");

    }
}

// Leonardo Rodrigues Reis Lopes