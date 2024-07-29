public class TestaVendavel {
    public static void main(String[] args) {
        Produto livro = new Produto("Notebook DELL", 2500.00);
        Servico formatacao = new Servico("Manutenção PC", 150.00);

        livro.aplicarDesconto(10.0);
        formatacao.aplicarDesconto(5.0);

        System.out.println("Preço final do produto (5 unidades): " + livro.calcularPrecoTotal(5));
        System.out.println("Preço final do serviço (3 horas): " + formatacao.calcularPrecoTotal(3));
    }
}