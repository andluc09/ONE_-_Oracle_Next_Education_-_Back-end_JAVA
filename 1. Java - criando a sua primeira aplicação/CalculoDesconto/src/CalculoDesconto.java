public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        //System.out.println("\nPreço original: R$" + precoOriginal);
        //System.out.println("Desconto: R$" + valorDesconto);
        //System.out.println("\nNovo preço com desconto: R$" + novoPreco);

        System.out.println("""
                \nPreço original: R$ %.2f
                Desconto: R$ %.2f
                \nNovo preço com desconto: R$ %.2f
                """.formatted(precoOriginal, valorDesconto, novoPreco));
    }
}
