package Etapa2;

public class C08EX27 {
    public static void main(String[] args) {
        for (int n = 1; n <= 2; n++) {
            for (int j = 1; j <= 128; j*=2) {
                for (int i = 1; i <= j; i++){
                    System.out.print(" *");
               }
                System.out.println();
            }
            for (int j = 64; j >= 1; j/=2) {
                for (int i = 1; i <= j; i++)
                    System.out.print(" *");
                System.out.println();
            }
        }
    }
}

// Leonardo Rodrigues Reis Lopes