package Etapa2;

public class C09EX11D {
    public static void main(String[] args) {
        int termos = 100;
        double  den, serie=0, num=0, termo;
        for (int aux = 1; aux <= termos; aux++) {
            num += Math.pow(aux,3);
            den = Math.pow(10,aux-1);
            termo = num/den;
            serie+= termo;
        }
        System.out.println("O valor da série é " + serie);
    }
}

// Leonardo Rodrigues Reis Lopes