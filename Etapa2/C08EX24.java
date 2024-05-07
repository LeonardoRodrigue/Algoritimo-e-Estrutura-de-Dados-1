package Etapa2;

public class C08EX24 {
    public static void main(String[] args) {
        double serie, num, result = 0;

        for (int i = 1; i <= 100; i+=2){
            num = Math.pow(2,i);
            result += num;
        }
        serie = ((double) 1 / 3) * result;
        System.out.println("Valor da serie = "+serie);
    }
}

// Leonardo Rodrigues Reis Lopes