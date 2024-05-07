package Etapa2;

public class C11EX14 {
    public static void main(String[] args) {
        double pi = 0;
        int termos = 0;
        double limiteSuperior = 3.1417;
        double limiteInferior = 3.1416, termo;

        for (int i = 0; true; i++) {
            termo = (i % 2 == 0) ? 1.0 / (2 * i + 1) : -1.0 / (2 * i + 1);
            pi += 4 * termo;
            termos++;

            if (pi > limiteInferior && pi < limiteSuperior) {
                break;
            }
        }

        System.out.println("O valor de pi é: " + pi);
        System.out.println("Foram necessários " + termos + " termos para que o valor de pi fique entre 3.1416 e 3.1417.");
    }
}

// Leonardo Rodrigues Reis Lopes