package Etapa1;

import java.util.Scanner;

public class C06EX16 {
    public static void main(String[] args) {
        
        int num_faltas, idade;
        double n1, n2, n3, nota_trabalho;
        double maior_nota, seg_maior = 0, media, nota_final;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor obtido na primeira prova: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o valor obtido na segunda prova: ");
        n2 = sc.nextDouble();
        System.out.print("Digite o valor obtido na terceira prova: ");
        n3 = sc.nextDouble();
        System.out.print("Digite o numero de faltas que foram acumuladas: ");
        num_faltas = sc.nextInt();
        System.out.print("Digite a nota do trabalho final: ");
        nota_trabalho = sc.nextDouble();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        maior_nota = Math.max(Math.max(n1, n2), n3);

        if (maior_nota != n1 && maior_nota != n2){
            seg_maior = Math.max(n1, n2);
        } else if (maior_nota != n1 && maior_nota != n3) {
            seg_maior = Math.max(n1, n3);
        } else if (maior_nota != n2 && maior_nota != n3) {
            seg_maior = Math.max(n2, n3);
        }

        media = (maior_nota + seg_maior) / 2;
        nota_final = (media * 1) + (nota_trabalho * 2);

        if (num_faltas <= 10 && nota_final >= 6.0 && idade >= 18) {
            System.out.println("Resultado Final: Excelente");
        } else if (num_faltas <= 20 && nota_final >= 4.0 && idade >= 18) {
            System.out.println("Resultado Final: Regular");
        } else {
            System.out.println("Resultado Final: Reprovado");
        }

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes