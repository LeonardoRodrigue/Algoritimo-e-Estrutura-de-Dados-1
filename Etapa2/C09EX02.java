package Etapa2;

public class C09EX02 {
    public static void main(String[] args) {
        double num, den, serie=0;
        for (int i=1; i<=100; i++) {
            num = i;
            den = Math.pow(i, 2)+(i-1);
            serie += num / den;
        }
        System.out.print("Valor da Série = "+serie);
    }
}

// Leonardo Rodrigues Reis Lopes