package Etapa2;

public class C09EX08 {
    public static void main(String[] args) {
        double num, den, calculo, serie = 0;
        int numero = 5, denominador = 5;

        for (int i = 0; i < 20; i++) {
            num = (3 + 2 * i) * Math.sqrt(numero + 4 * i);
            den = denominador;
            serie += num / den;
            denominador *= 5;
        }

        calculo = Math.pow(serie, 2);
        System.out.print("Valor da Série = "+calculo);
    }
}

// Leonardo Rodrigues Reis Lopes