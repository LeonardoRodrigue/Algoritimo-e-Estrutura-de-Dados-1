package Etapa2;

import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args) {
        int cont_cand1 = 0, cont_cand2 = 0, cont_cand3 = 0, cont_nulos = 0, soma_validos = 0;
        int voto, voto_desempate;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do candidato para computar o voto");
        System.out.println("1 - Fulano, 2 - Ciclano e 3 - Beltrano\n");

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite o numero do voto: ");
            voto = sc.nextInt();
            if (voto < 1 || voto > 3){
                cont_nulos++;
            } else {
                if (voto == 1){
                    cont_cand1++;
                } else if (voto == 2) {
                    cont_cand2++;
                } else if (voto == 3) {
                    cont_cand3++;
                }
            }
        }

        soma_validos = cont_cand1 + cont_cand2 + cont_cand3;
        if (soma_validos < cont_nulos){
            System.out.println("Eleição anulada!");
            System.exit(0);
        } else if (cont_cand1 > cont_cand2 && cont_cand1 > cont_cand3){
                System.out.println("O candidato vencedor é o 1 - Fulano");
                System.exit(0);
        } else if (cont_cand2 > cont_cand1 && cont_cand2 > cont_cand3) {
                System.out.println("O candidato vencedor é o 2 - Ciclano");
                System.exit(0);
        } else if (cont_cand3 > cont_cand1 && cont_cand3 > cont_cand2) {
                System.out.println("O candidato vencedor é o 3 - Beltrano");
                System.exit(0);
        } else if (cont_cand1 == cont_cand2 && cont_cand1 == cont_cand3 && cont_cand2 == cont_cand3){
            System.out.println("Ocorreu um empate triplo, será realizado um segundo turno!");
            System.out.println("Digite o numero do candidato para computar o voto");
            System.out.println("1 - Fulano, 2 - Ciclano e 3 - Beltrano\n");

            cont_cand1 = 0;
            cont_cand2 = 0;
            cont_cand3 = 0;
            cont_nulos = 0;
            soma_validos = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o numero do voto: ");
                voto_desempate = sc.nextInt();
                if (voto_desempate < 1 || voto_desempate > 3) {
                    cont_nulos++;
                } else {
                    if (voto_desempate == 1) {
                        cont_cand1++;
                    } else if (voto_desempate == 2) {
                        cont_cand2++;
                    } else {
                        cont_cand3++;
                    }
                }
            }
            soma_validos = cont_cand1 + cont_cand2 + cont_cand3;
            if (soma_validos < cont_nulos){
                System.out.println("Eleição anulada!");
                System.exit(0);
            } else if (cont_cand1 > cont_cand2 && cont_cand1 > cont_cand3){
                System.out.println("O candidato vencedor é o 1 - Fulano");
                System.exit(0);
            } else if (cont_cand2 > cont_cand1 && cont_cand2 > cont_cand3) {
                System.out.println("O candidato vencedor é o 2 - Ciclano");
                System.exit(0);
            } else if (cont_cand3 > cont_cand1 && cont_cand3 > cont_cand2) {
                System.out.println("O candidato vencedor é o 3 - Beltrano");
                System.exit(0);
            } 
            
        } else if (cont_cand1 == cont_cand2) {
            System.out.println("Ocorreu um empate entre os candidatos 1 e 2, será realizado um segundo turno!");
            System.out.println("Digite o numero do candidato para computar o voto");
            System.out.println("1 - Fulano ou 2 - Ciclano\n");

            cont_cand1 = 0;
            cont_cand2 = 0;
            cont_nulos = 0;
            soma_validos = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o numero do voto: ");
                voto_desempate = sc.nextInt();
                if (voto_desempate < 1 || voto_desempate > 2) {
                    cont_nulos++;
                } else {
                    if (voto_desempate == 1) {
                        cont_cand1++;
                    } else {
                        cont_cand2++;
                    }
                }
            }
            soma_validos = cont_cand1 + cont_cand2;
            if (soma_validos < cont_nulos){
                System.out.println("Eleição anulada!");
                System.exit(0);
            } else if (cont_cand1 > cont_cand2){
                System.out.println("O candidato vencedor é o 1 - Fulano");
                System.exit(0);
            } else if (cont_cand2 > cont_cand1) {
                System.out.println("O candidato vencedor é o 2 - Ciclano");
                System.exit(0);
            }
            
        } else if (cont_cand1 == cont_cand3) {
            System.out.println("Ocorreu um empate entre os candidatos 1 e 3, será realizado um segundo turno!");
            System.out.println("Digite o numero do candidato para computar o voto");
            System.out.println("1 - Fulano ou 3 - Beltrano\n");

            cont_cand1 = 0;
            cont_cand3 = 0;
            cont_nulos = 0;
            soma_validos = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o numero do voto: ");
                voto_desempate = sc.nextInt();
                if (voto_desempate < 1 || voto_desempate > 3 || voto_desempate == 2) {
                    cont_nulos++;
                } else {
                    if (voto_desempate == 1) {
                        cont_cand1++;
                    } else {
                        cont_cand3++;
                    }
                }
            }
            soma_validos = cont_cand1 + cont_cand3;
            if (soma_validos < cont_nulos){
                System.out.println("Eleição anulada!");
                System.exit(0);
            } else if (cont_cand1 > cont_cand3){
                System.out.println("O candidato vencedor é o 1 - Fulano");
                System.exit(0);
            } else if (cont_cand3 > cont_cand1) {
                System.out.println("O candidato vencedor é o 3 - Beltrano");
                System.exit(0);
            }
            
        } else if (cont_cand2 == cont_cand3) {
            System.out.println("Ocorreu um empate entre os candidatos 2 e 3, será realizado um segundo turno!");
            System.out.println("Digite o numero do candidato para computar o voto");
            System.out.println("2 - Ciclano ou 3 - Beltrano\n");

            cont_cand2 = 0;
            cont_cand3 = 0;
            cont_nulos = 0;
            soma_validos = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o numero do voto: ");
                voto_desempate = sc.nextInt();
                if (voto_desempate < 2 || voto_desempate > 3) {
                    cont_nulos++;
                } else {
                    if (voto_desempate == 2) {
                        cont_cand2++;
                    } else {
                        cont_cand3++;
                    }
                }
            }
            soma_validos = cont_cand2 + cont_cand3;
            if (soma_validos < cont_nulos){
                System.out.println("Eleição anulada!");
                System.exit(0);
            } else if (cont_cand2 > cont_cand3){
                System.out.println("O candidato vencedor é o 2 - Ciclano");
                System.exit(0);
            } else if (cont_cand3 > cont_cand2) {
                System.out.println("O candidato vencedor é o 3 - Beltrano");
                System.exit(0);
            }
        } else {
            System.out.println("ERRO");
            System.exit(0);
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes