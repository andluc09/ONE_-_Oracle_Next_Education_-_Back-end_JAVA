public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        //System.out.println("\nO valor em reais é: " + valorEmReais);

        System.out.println("\nO valor em reais é: %.2f".formatted(valorEmReais));
    }
}
