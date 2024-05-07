package Etapa1;

import java.util.Scanner;

public class C06EX09 {
    public static void main(String[] args) {
        
        double altura, peso_ideal;
        String sexo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o sexo, exemplo 'F' para feminino e 'M' para masculino: ");
        sexo = sc.nextLine();
        System.out.print("Digite a altura em metros: ");
        altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("m")) {
            peso_ideal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("m")) {
            peso_ideal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Digite 'F' ou 'M'!!!");
            peso_ideal = 0;
        }
        System.out.println("O peso ideal é: " + peso_ideal);
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes