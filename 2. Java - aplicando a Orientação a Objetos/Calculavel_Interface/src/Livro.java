public class Livro extends Produto implements Calculavel {
    private String autor;

    public Livro(double preco, String autor) {
        super(preco);
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }

    // Getter e Setter para autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}