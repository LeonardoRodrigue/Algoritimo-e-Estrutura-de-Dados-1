package Etapa2;

import javax.swing.JOptionPane;

public class C08EX11 {
    public static void main(String[] args) {
        String[] estado_civil_opcoes = {"Solteiro", "Casado", "Outros"};
        String[] sexo_opcoes = {"Masculino", "Feminino"};
        String[] cor_olhos_opcoes = {"Azul", "Castanhos", "Preto", "Outros"};
        String[] cor_cabelo_opcoes = {"Loiro", "Preto", "Castanho", "Ruivo"};
        String[] escolaridade_opcoes = {"Analfabeto", "Ensino Fundamental", "Ensino Médio", "Ensino Superior"};
        Object estado_civil = null, sexo = null, cor_olhos = null, cor_cabelo = null, escolaridade = null;
        int idade = 0, cont = 0;
        double salario = 0, maior_salario = 0, maior_salario_homens = 0, menor_salario_homens = 0, diferenca_min_max = 0;
        String nome = null, nome_maior = "", idadestr, salariostr;

        for (int i = 1; i <= 50; i++) {
            nome = JOptionPane.showInputDialog(null,
                    "Digite seu nome:",
                    "Nome",
                    JOptionPane.QUESTION_MESSAGE);
            idadestr = JOptionPane.showInputDialog(null,
                    "Digite sua idade:",
                    "Idade",
                    JOptionPane.QUESTION_MESSAGE);
            idade = Integer.valueOf(idadestr);
            estado_civil = JOptionPane.showInputDialog(null,
                    "Selecione seu estado civil:",
                    "Estado Civil",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    estado_civil_opcoes,
                    "Solteiro");
            sexo = JOptionPane.showInputDialog(null,
                    "Selecione seu sexo:",
                    "Sexo",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    sexo_opcoes,
                    "Masculino");
            cor_olhos = JOptionPane.showInputDialog(null,
                    "Selecione a cor do seus olhos:",
                    "Cor dos olhos",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    cor_olhos_opcoes,
                    "Azul");
            cor_cabelo = JOptionPane.showInputDialog(null,
                    "Selecione a cor do seu cabelo:",
                    "Cor do Cabelo",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    cor_cabelo_opcoes,
                    "Loiro");
            salariostr = JOptionPane.showInputDialog(null,
                    "Digite seu salario:",
                    "Salario",
                    JOptionPane.QUESTION_MESSAGE);
            salario = Double.valueOf(salariostr);
            escolaridade = JOptionPane.showInputDialog(null,
                    "Selecione seu nível de escolaridade:",
                    "Escolaridade",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    escolaridade_opcoes,
                    "Analfabeto");

            if (i == 1 || salario > maior_salario) {
                maior_salario = salario;
                nome_maior = nome;
            }
            if (sexo == "Feminino" && cor_cabelo == "Loiro" && (idade >= 18 && idade <= 25) && estado_civil == "Solteiro" &&
                    salario > 10000 && escolaridade == "Ensino Superior"){
                    cont++;
            }
            if (sexo == "Masculino"){
                if (i == 1 || salario > maior_salario_homens) {
                    maior_salario_homens = salario;
                }
                if (i == 1 || salario < menor_salario_homens) {
                    menor_salario_homens = salario;
                }
            }
        }
        diferenca_min_max = maior_salario_homens - menor_salario_homens;
        JOptionPane.showMessageDialog(null,
                "A quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, " +
                        "salário maior que R$10.000,00 e curso superior completo é de --> "+ cont,
                "Quantidade",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "A pessoa com o maior salário é o "+nome_maior+ " com o salário de R$"+maior_salario,
                "Quantidade",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "A diferença entre o maior e o menor salário os homens é de R$"+diferenca_min_max,
                "Diferença",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
// Leonardo Rodrigues Reis Lopes