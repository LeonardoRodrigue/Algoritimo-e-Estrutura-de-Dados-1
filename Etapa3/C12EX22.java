package Etapa3;

import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {
        String placa[] = new String[10];
        String nome[] = new String[10];
        String busca;
        boolean encontrado = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do dono e a placa do carro!");

        for (int i = 0; i < placa.length; i++){
            System.out.print("Digite o nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite a placa do carro: ");
            placa[i] = sc.nextLine();
        }
        System.out.println("Digite a placa do carro ou o nome do proprietario para saber o numero da sua vaga: ");
        busca = sc.nextLine();
        for (int i = 0; i < placa.length; i++){
            if (placa[i].equalsIgnoreCase(busca) || nome[i].equalsIgnoreCase(busca)){
                System.out.println("O proprietario "+nome[i]+ " do veiculo com a placa "+placa[i]+ " possui acesso a vaga "+(i+1)+"!");
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            System.out.println("Nome ou Placa não encontrada no sistema!");
        }
        sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes