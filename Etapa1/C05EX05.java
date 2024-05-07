package Etapa1;

import java.util.Scanner;

public class C05EX05 {
    public static void main(String[] args) {
        double celsius, kelvin, fahrenheit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = sc.nextDouble();

        kelvin = celsius + 273;
        fahrenheit = (celsius * 1.8) + 32;

        System.out.print("Kelvin = " + kelvin);
        System.out.print("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes