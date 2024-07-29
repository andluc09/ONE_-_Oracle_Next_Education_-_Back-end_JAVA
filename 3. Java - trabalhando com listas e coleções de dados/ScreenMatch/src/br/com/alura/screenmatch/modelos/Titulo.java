package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome; // Atributos
    private int anoLancamento; // Public
    private boolean incluidoPlano;
    private double somaAvaliacoes; // Tornando privado um atributo, ele somente poderá ser consultado através de um Método Acessor
    private int totalAvaliacoes; // Private
    private int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public int getTotalAvaliacoes(){ // GET —> Pega valores
        return this.totalAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) { // SET —> Atribuí valores
        this.nome = nome; // “this” se refere ao objeto atual e não ao parâmetro do método
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean getIncluidoPlano() {
        return this.incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public int getDuracaoMinutos() {
        return this.duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeFichaTecnica(){ // Método
        System.out.println("Nome do filme: " + nome); // Instanciar um objeto
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração em minutos: " + duracaoMinutos);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMediaAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
