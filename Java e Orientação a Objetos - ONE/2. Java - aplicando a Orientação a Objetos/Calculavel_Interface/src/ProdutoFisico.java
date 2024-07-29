public class ProdutoFisico extends Produto implements Calculavel {

    public ProdutoFisico(double preco) {
        super(preco);
    }

    @Override
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        return getPreco() * 1.05;
    }
}
