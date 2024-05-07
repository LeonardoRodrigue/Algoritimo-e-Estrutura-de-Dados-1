package Etapa2;

public class C09EX11F {
    public static void main(String[] args) {
        int termos = 100;
        double  den, num=0;
        long serie =0, termo=0;
        for (int aux = 1; aux <= termos; aux++) {
            num += Math.pow(2,aux+1) * (2 *aux -1);
            den = Math.pow(5* aux -3,2);
            termo = (long) (5* Math.sqrt(num/den));
        }
        serie+= termo;
        System.out.println("O valor da série é " + serie);

    }
}

// Leonardo Rodrigues Reis Lopes