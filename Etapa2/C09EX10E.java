package Etapa2;

public class C09EX10E {
    public static void main(String[] args) {
        double num, den, serie = 0, result = 0;

        for (int i = 1; i <= 100; i++) {
            num = i;
            den = 3 * (i * 2);
            serie += num / den;
        }
        result = serie;

        System.out.println("Valor da Série E = "+result);
    }
}

// Leonardo Rodrigues Reis Lopes