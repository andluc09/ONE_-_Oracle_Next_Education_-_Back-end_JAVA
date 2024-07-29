public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(); // Um objeto criado a partir de uma classe que herda da superclasse: Animal
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}