package Etapa2;

public class C08EX16 {
    public static void main(String[] args) {
        int cont = 0, soma = 0;
        double media;

        for (int i = 1000; i <= 2000; i++){
            if (i % 2 != 0){
                soma += i;
                cont++;
            }
        }
        media = (double) soma / cont;
        System.out.println("A media dos numeros impares de 1000 a 2000 é = "+media);
    }
}

// Leonardo Rodrigues Reis Lopes