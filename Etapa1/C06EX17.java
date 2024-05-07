package Etapa1;

import java.util.Scanner;

public class C06EX17 {
    private static final boolean True = false;
    private static final boolean False = false;

    public static void main(String[] args) {
        String p1, p2, p3, p4, p5, p6, p7, p8, p9;
	    boolean aprovado = False, criterio1 = False, criterio2 = False, criterio3 = False;

        Scanner sc = new Scanner(System.in);

	System.out.println("Digite 'F' ou 'V' para as perguntas a seguir: ");
        System.out.print("Você tem curso técnico de programação? ");
        p1 = sc.nextLine();
        System.out.print("Você tem curso superior de programação? ");
	p2 = sc.nextLine();
        System.out.print("Você tem menos de 3 anos de experiência em programação? ");
	p3 = sc.nextLine();
        System.out.print("Você se considera uma pessoa criativa? ");
	p4 = sc.nextLine();
        System.out.print("Você prefere liderar a ser liderado? ");
	p5 = sc.nextLine();
        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? ");
	p6 = sc.nextLine();
        System.out.print("Você é autodidata (aprende sozinho)? ");
	p7 = sc.nextLine();
        System.out.print("Você aceitaria uma remuneração inicial de R$1500? ");
	p8 = sc.nextLine();
        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
	p9 = sc.nextLine();

	if (p1.equalsIgnoreCase("V") || p1.equalsIgnoreCase("v") &&
        p2.equalsIgnoreCase("F") || p2.equalsIgnoreCase("f") &&
        p3.equalsIgnoreCase("F") || p3.equalsIgnoreCase("f")){
		criterio1 = True;
	} else if (p1.equalsIgnoreCase("F") || p1.equalsIgnoreCase("f") &&
        p2.equalsIgnoreCase("V") || p2.equalsIgnoreCase("V") &&
        p3.equalsIgnoreCase("F") || p3.equalsIgnoreCase("f")) {
        criterio1 = True;
    } else if (p1.equalsIgnoreCase("V") || p1.equalsIgnoreCase("v") &&
        p2.equalsIgnoreCase("V") || p2.equalsIgnoreCase("v") &&
        p3.equalsIgnoreCase("V") || p3.equalsIgnoreCase("v")) {
       criterio1 = True;
    } else {
		criterio1 = False;
	}

	if (p5.equalsIgnoreCase("V") || p5.equalsIgnoreCase("v")){
		criterio2 = False;
	} else {
		criterio2 =  True;
	}

    if ((p8.equalsIgnoreCase("F") || p8.equalsIgnoreCase("f"))){
        criterio3 = False;
    } else {
        criterio3 = True;
    }

	if (criterio1 == True && criterio2 == True && criterio3 == True){
		if ((p4.equalsIgnoreCase("V") || p4.equalsIgnoreCase("v")) &&
        (p6.equalsIgnoreCase("F") || p6.equalsIgnoreCase("f")) &&
        (p7.equalsIgnoreCase("V") || p7.equalsIgnoreCase("v")) &&
        (p9.equalsIgnoreCase("F") || p9.equalsIgnoreCase("f"))){
			aprovado = True;
		} else {
			aprovado = False;
		}
	} else {
		aprovado = False;
	}

	if (aprovado == True) {
		System.out.println("Você foi aprovado!!!");
	} else {
        System.out.println("Você não foi aprovado!");
    }

	sc.close();
    }
}

// Leonardo Rodrigues Reis Lopes