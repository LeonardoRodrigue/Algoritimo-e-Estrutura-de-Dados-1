package Etapa2;

public class C08EX23 {
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        int soma = 0, cont = 0;
        double media;

        for (int i = 1000; i <= 9999; i++){
            n1 = i / 1000;
            n2 = i / 100 % 10;
            n3 = i / 10 % 10;
            n4 = i % 10;
            if (n1 == n4 && n2 == n3){
                System.out.println(i+" é um palindro");
                cont++;
                soma += i;
            }
        }
        media = soma / cont;
        System.out.println("A media dos palindros é "+media);
    }
}

// Leonardo Rodrigues Reis Lopes