package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    // @SerializedName("Title")
    private String nome; // Atributos
    // @SerializedName("Year")
    private int anoLancamento; // Public
    private boolean incluidoPlano;
    private double somaAvaliacoes; // Tornando privado um atributo, ele somente poderá ser consultado através de um Método Acessor
    private int totalAvaliacoes; // Private
    private int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 04 (quatro) caracteres.");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
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

    @Override
    public String toString() {
        return "(nome = '" + nome + ", anoLancamento = " + anoLancamento + ", " +
                "duração = " + duracaoMinutos + ")";
    }
}
