package Etapa3;

public class C15EX01 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Simba", "Panthera leo", 8, 190, false);
        Animal animal2 = new Animal("Dory", "Paracanthurus hepatus", 2, 1, true);
        Animal animal3 = new Animal("Tweety", "Serinus canaria", 3, 0, true);

        System.out.println(animal1.getDescricao());
        animal1.emitirSom();
        System.out.println();

        System.out.println(animal2.getDescricao());
        animal2.emitirSom();
        System.out.println();

        System.out.println(animal3.getDescricao());
        animal3.emitirSom();
        System.out.println();

        animal1.alimentar(10);
        animal2.alimentar(1);
        animal3.alimentar(0);
        System.out.println();

        Cachorro cachorro1 = new Cachorro("Rex", "Canis lupus familiaris", 5, 30, true, "Labrador", "Grande");
        Cachorro cachorro2 = new Cachorro("Bella", "Canis lupus familiaris", 3, 15, true, "Beagle", "Médio");
        Cachorro cachorro3 = new Cachorro("Toby", "Canis lupus familiaris", 2, 10, true, "Poodle", "Pequeno");

        System.out.println(cachorro1.getDescricao());
        cachorro1.emitirSom();
        System.out.println();

        System.out.println(cachorro2.getDescricao());
        cachorro2.emitirSom();
        System.out.println();

        System.out.println(cachorro3.getDescricao());
        cachorro3.emitirSom();
    }
}

// Leonardo Rodrigues Reis Lopes