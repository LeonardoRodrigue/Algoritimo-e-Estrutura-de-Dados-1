package Etapa1;
import javax.swing.JOptionPane;

public class C04EX04 {
    public static void main(String[] args) {
        String nome_inic, nome_mei, nome_fim, idadestr;
        int idade;
        nome_inic = JOptionPane.showInputDialog(null,
                "Digite seu primeiro nome:",
                "Primeiro nome",
                JOptionPane.QUESTION_MESSAGE);
        nome_mei = JOptionPane.showInputDialog(null,
                "Digite seu segundo nome:",
                "Segundo nome",
                JOptionPane.QUESTION_MESSAGE);
        nome_fim = JOptionPane.showInputDialog(null,
                "Digite seu ultimo nome:",
                "Ultimo nome",
                JOptionPane.QUESTION_MESSAGE);
        idadestr = JOptionPane.showInputDialog(null,
                "Digite sua idade:",
                "Idade",
                JOptionPane.QUESTION_MESSAGE);
        idade = Integer.valueOf(idadestr);
        JOptionPane.showMessageDialog(null,
                nome_fim+ ", "+nome_inic+" "+nome_mei
                +"\nIdade: "+idade,
                "Informações",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

// Leonardo Rodrigues Reis Lopes