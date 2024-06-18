package Etapa3;

public class C13EX02_classe {
    public static double calcula_fx(double valor_x){
        double fx;
        if (valor_x < 4){
            fx = ((5 * valor_x) + 3) / Math.sqrt(16-valor_x);
        } else if (valor_x == 4) {
            fx = 0;
        } else {
            fx = ((5 * valor_x) + 3) / Math.sqrt(Math.pow(valor_x,2) - 16);
        }
        return fx;
    }
}

// Leonardo Rodrigues Reis Lopes