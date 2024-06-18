package Etapa3;

public class Cachorro extends Animal {
    private String raca;
    private String porte;

    public Cachorro(String nome, String especie, int idade, int peso, boolean domestico, String raca, String porte) {
        super(nome, especie, idade, peso, domestico);
        this.raca = raca;
        this.porte = porte;
    }

    public String getDescricao() {
        return super.getDescricao() + ", Raça: " + raca + ", Porte: " + porte;
    }

    public void emitirSom() {
        System.out.println(getNome() + " está latindo.");
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
}

// Leonardo Rodrigues Reis Lopes