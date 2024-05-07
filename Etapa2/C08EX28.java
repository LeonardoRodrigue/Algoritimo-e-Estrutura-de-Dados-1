package Etapa2;

public class C08EX28 {
    public static void main(String[] args) {
        double media = 0, soma = 0;
        int cont = 0, numero_triangular;

        for (int i = 1; i <= 1000; i++){
            numero_triangular = i * (i + 1) * (i + 2);
            if (numero_triangular > 1000){
                break;
            }
            System.out.println(numero_triangular);
            soma += numero_triangular;
            cont++;
        }
        media = soma / cont;
        System.out.println("A media dos numeros triangulares entre 1 e 1000 é "+media);
    }
}
