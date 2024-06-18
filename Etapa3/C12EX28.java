package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX28 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();
        List<Integer> ra = new ArrayList<Integer>();
        String temp_nome, nome_digitado, nome_procurado;
        int temp_ra, ra_digitado, posicao = -1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o nome aluno: ");
            nome_digitado = sc.nextLine();
            if (nome_digitado.equalsIgnoreCase("X")){
                break;
            }
            System.out.print("Digite o RA deste aluno: ");
            ra_digitado = sc.nextInt();
            sc.nextLine();
            nomes.add(nome_digitado);
            ra.add(ra_digitado);
        } while (!nome_digitado.equalsIgnoreCase("X"));

        for (int i = 0; i < nomes.size() - 1; i++){
            for (int x = 0; x < nomes.size() - 1; x++){
                if (nomes.get(x).compareToIgnoreCase(nomes.get(x+1)) > 0){
                    temp_nome = nomes.get(x);
                    nomes.set(x,nomes.get(x+1));
                    nomes.set(x+1,temp_nome);
                    temp_ra = ra.get(x);
                    ra.set(x,ra.get(x+1));
                    ra.set(x+1,temp_ra);
                }
            }
        }

        System.out.print("Digite o nome que deseja procurar: ");
        nome_procurado = sc.nextLine();

        for (int z = 0; z < nomes.size() - 1; z++){
            if (nomes.get(z).equalsIgnoreCase(nome_procurado)){
                posicao = z;
                break;
            }
        }

        if (posicao == -1){
            System.out.println("NOME NÃO ENCONTRADO");
        } else {
            System.out.print("Aluno: "+nomes.get(posicao)+" possui o RA "+ra.get(posicao)+" e esta na posição "+(posicao+1)+"º em ordem alfabetica.");
        }

        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes