package Etapa2;

public class C08EX26 {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            for (int j = 1; j <= 10; j++) {
                for (int i = 1; i <= j; i++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }
            for (int j = 10; j >= 1; j--) {
                for (int i = 1; i <= j; i++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }
        }
    }
}

// Leonardo Rodrigues Reis Lopes