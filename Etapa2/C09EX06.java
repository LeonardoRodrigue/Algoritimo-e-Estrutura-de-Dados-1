package Etapa2;

public class C09EX06 {
    public static void main(String[] args) {
        double num, den, calculo, serie=0;

        for (int i=1; i<=20; i++) {
            num = i;
            den = Math.sqrt(i * 2);
            serie += num / den;
        }
        calculo = 10 + serie;
        System.out.print("Valor da Série = "+calculo);
    }
}

// Leonardo Rodrigues Reis Lopes