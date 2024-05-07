package Etapa2;

public class C09EX11E {
    public static void main(String[] args) {
        int termos = 100;
        double serie = 0;

        for (int n = 1; n <= termos; n++) {
            double numerador = n * n;
            double denominador = Math.pow(n + 1, n);
            double termo = numerador * Math.sqrt(2 * n + 3) / denominador;
            serie += termo;
        }

        double resultado = 2.0 / 3.0 * serie;
        System.out.println("O valor da série é " + resultado);

    }
}

// Leonardo Rodrigues Reis Lopes