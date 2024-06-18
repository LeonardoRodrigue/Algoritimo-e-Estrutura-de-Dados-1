package Etapa3;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private int peso;
    private boolean domestico;

    public Animal(String nome, String especie, int idade, int peso, boolean domestico){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.domestico = domestico;
    }

    public String getDescricao() {
        return "Nome: " + nome + ", Espécie: " + especie + ", Idade: " + idade +
                " anos, Peso: " + peso + " kg, Doméstico: " + (domestico ? "Sim" : "Não");
    }

    public void emitirSom() {
        System.out.println(nome + " está emitindo um som.");
    }

    public void alimentar(int quantidade) {
        if (quantidade > 0) {
            peso += quantidade;
            System.out.println(nome + " foi alimentado e agora pesa " + peso + " kg.");
        } else {
            System.out.println("Quantidade de alimento inválida.");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isDomestico() {
        return domestico;
    }
    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }
}

// Leonardo Rodrigues Reis Lopes