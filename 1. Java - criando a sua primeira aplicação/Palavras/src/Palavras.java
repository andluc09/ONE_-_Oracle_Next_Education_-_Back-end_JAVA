public class Palavras{
    public static void main(String[] args) {
        char letra = 'A';
        String palavra = "ZUL";

        //String mensagem = "\nA letra é " + letra + " e a palavra é " + letra + palavra;

        String mensagem = "\nA letra é %s e a palavra é %s". formatted(letra, letra + palavra);

        System.out.println(mensagem);
    }
}
