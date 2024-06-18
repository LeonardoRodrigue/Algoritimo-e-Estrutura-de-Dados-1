package Etapa3;
import javax.swing.JOptionPane;

public class C14EX01 {
    public static void main(String[] args) {

        //Calculo do volume do círculo
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo: "));
        JOptionPane.showMessageDialog(null, "O volume do círculo é: " + C14EX01a.areaDoCirculo(raio));

        //Calculo do hipotenusa do triângulo
        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto 1: "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto 2: "));
        JOptionPane.showMessageDialog(null, "A hipotenusa do triângulo é: " + C14EX01b.hipotenusaTrianulo(cateto1, cateto2));

        //Calcular volume do cilindro
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do cilindro: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cilindro: "));
        JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + C14EX01c.volumeCilindro(raio, altura));

        //Calcular fatorial de um número
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é: " + C14EX01d.fatorialDeNum(num));

        //Calcular a soma dos primeiros números naturais
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null, "A soma dos " + num + " primeiros números naturais é: " + C14EX01e.somaPrimeirosNumNaturais(num));


    }
}

// Leonardo Rodrigues Reis Lopes