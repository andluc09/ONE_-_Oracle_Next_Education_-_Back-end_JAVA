public class Principal {
    public static void main(String[] args) {
        //Animal animal = new Gato();
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("\nO objeto é um Cachorro.");
        } else {
            System.out.println("\nO objeto não é um Cachorro.");
        }
    }
}
