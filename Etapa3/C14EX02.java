package Etapa3;
import javax.swing.JOptionPane;

public class C14EX02 {
    public static void main(String[] args) {

        int solidos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do solido que deseja calcular: \n1 - Quadrado \n2 - Retangulo \n3 - Triangulo \n4 - Circulo"));

        switch (solidos) {
            case 1: //Quadrado
                double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado do quadrado: "));
                JOptionPane.showMessageDialog(null, "A area do quadrado e: " + C14EX02A.areadoQuadrado(lado));
                break;

            case 2: //Retangulo
                double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do retangulo: "));
                double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do retangulo: "));
                JOptionPane.showMessageDialog(null, "A area do retangulo e: " + C14EX02A.areadoRetangulo(base, altura));
                break;

            case 3: //Triangulo Retangulo
                base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do triangulo: "));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do triangulo: "));
                JOptionPane.showMessageDialog(null, "A area do triangulo e: " + C14EX02A.areaTriangulo(base, altura));
                break;

            case 4: //Circulo
                double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio do circulo: "));
                JOptionPane.showMessageDialog(null, "A area do circulo e: " + C14EX02A.areaCirculo(raio));
                break;

            default: JOptionPane.showMessageDialog(null, "Codigo invalido");
                break;
        }
    }
}

// Leonardo Rodrigues Reis Lopes