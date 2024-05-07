package Etapa2;

public class C09EX01 {
    public static void main(String[] args) {
        double num, den, num1 = 38, num2 = 39, serie=0;
        for (int i=1; i<=num2; i++) {
            num = (num1-i)*(num2-i);
            den = i;
            serie += num / den;
        }
        System.out.print("Valor da Série = "+serie);

    }
}

// Leonardo Rodrigues Reis Lopes