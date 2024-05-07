package Etapa2;

public class C08EX19 {
    public static void main(String[] args) {
        int soma = 0, num;
        for (int i = 1; i <= 100; i++){
            num = (int) Math.pow(i,2);
            System.out.println(num);
            soma += num;
        }
        System.out.println("\nA soma dos 100 primeiros numeros é "+soma);
    }
}

// Leonardo Rodrigues Reis Lopes