public class Produto{
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;

        double total = precoProduto * quantidade;

        //String mensagem = "\nO valor total da compra é R$ " + total;

        String mensagem = "\nO valor total da compra é R$ %.2f".formatted(total);

        System.out.println(mensagem);
    }
}
