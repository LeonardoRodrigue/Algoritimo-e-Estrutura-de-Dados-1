package Etapa2;

public class C09EX11B {
    public static void main(String[] args) {
        int termos = 100, num= 1;
        double  den, serie=0, serieB;
        for (int aux = 1; aux <= termos; aux++) {
            num +=3;
            den = Math.sqrt ((3 * aux) +4);
            serie += (num / den);
        }

        serieB = 5.0/3.0 * (serie);
        System.out.println("O valor da série é " + serieB);

    }
}

// Leonardo Rodrigues Reis Lopes