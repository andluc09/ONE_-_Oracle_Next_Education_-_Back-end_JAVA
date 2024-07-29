public class Titulo implements Comparable<Titulo> {
    String nome;

    // Construtor para inicializar o nome
    public Titulo(String nome) {
        this.nome = nome;
    }

    // Getter para o campo nome
    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}