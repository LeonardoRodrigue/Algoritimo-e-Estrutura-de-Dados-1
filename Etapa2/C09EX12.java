package Etapa2;

public class C09EX12 {
    public static void main(String[] args) {
        int termos = 1000, num= 1;
        double  den, serie = 0, seriePI = 0, contpares = 0, contimpares = 0;
        for (int aux = 1; aux <= termos; aux++) {
            den = 2 * aux - 1;
            serie += num / den;
            if (aux % 2 == 0) {
                contpares++;
            }else {
                contimpares++;
            }

            seriePI = 1 + contimpares - contpares;
        }
        seriePI *= 4;
        System.out.println("O valor da série é " + seriePI);
    }
}

// Leonardo Rodrigues Reis Lopes