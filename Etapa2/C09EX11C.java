package Etapa2;

public class C09EX11C {
    public static void main(String[] args) {
        int termos = 100;
        double  den, serie=0, num=0, serieC;
        for (int aux = 1; aux <= termos; aux++) {
            num +=(2* aux +1) * Math.sqrt(4 * aux +1);
            den = Math.pow(5,aux);
            serie += (num / den);
        }

        serieC = Math.pow (serie,2);
        System.out.println("O valor da série é " + serieC);

    }
}


// Leonardo Rodrigues Reis Lopes