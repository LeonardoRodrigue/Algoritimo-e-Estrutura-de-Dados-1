package Etapa2;

public class C09EX10F {
    public static void main(String[] args) {
        double num, den, serie = 0, result = 0;

        for (int i = 1; i <= 100; i++) {
            num = Math.pow(i,2);
            den = Math.pow((i * 2), 2);
            serie += num / den;
        }
        result = serie;

        System.out.println("Valor da Série F = "+result);
    }
}

// Leonardo Rodrigues Reis Lopes