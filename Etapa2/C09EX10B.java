package Etapa2;

public class C09EX10B {
    public static void main(String[] args) {
        double num, den, serie = 0, result = 0;

        for (int i = 1; i <= 100; i++) {
            num = i * 2;
            den = i * 3;
            serie += num / den;
        }
        result = 1 + Math.sqrt(serie);

        System.out.println("Valor da Série B = "+result);
    }
}

// Leonardo Rodrigues Reis Lopes