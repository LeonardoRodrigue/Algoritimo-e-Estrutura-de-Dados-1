package Etapa2;

public class C09EX10C {
    public static void main(String[] args) {
        double num, den, serie = 0, result = 0;

        for (int i = 1; i <= 100; i++) {
            num = (i * 2) - 1;
            den = i * 2;
            serie += num / den;
        }
        result = Math.pow(serie, 2) / 3;

        System.out.println("Valor da Série C = "+result);
    }
}

// Leonardo Rodrigues Reis Lopes