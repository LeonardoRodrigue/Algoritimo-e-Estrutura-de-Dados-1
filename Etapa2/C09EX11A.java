package Etapa2;

public class C09EX11A {
    public static void main(String[] args) {
        double num, den, serie = 0, result = 0;

        for (int i = 1; i <= 10; i++) {
            if (i == 1){
                num = 2;
            } else {
                num = i + (i + 7);
            }
            den = Math.pow((i - 1), i);
            serie += num / den;
        }
        result = Math.cbrt(serie);

        System.out.println("Valor da Série A = "+result);
    }
}

// Leonardo Rodrigues Reis Lopes