package Etapa2;

public class C09EX07 {
    public static void main(String[] args) {
        double num, den, calculo, serie = 0;

        for (int i=0; i<6; i++) {
            num = (i * 2) + ((i * 3) + 3);
            den = (i * 6) + 7;
            serie += num / den;
        }
        calculo = serie;
        System.out.print("Valor da Série = "+calculo);
    }
}

// Leonardo Rodrigues Reis Lopes