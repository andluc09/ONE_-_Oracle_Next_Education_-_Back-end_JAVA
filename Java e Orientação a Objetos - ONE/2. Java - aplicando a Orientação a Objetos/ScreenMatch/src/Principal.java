import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme; // O Import é a forma que uma classe se referência a outra quando estão em pacotes diferentes
import br.com.alura.screenmatch.modelos.Serie;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // após o new temos literalmente o OBJETO criado a partir de uma Classe
        // Eu posso ter múltiplas variáveis para um mesmo objeto que foi criado a partir de uma Classe (estrutura do meu objeto se repetirá neste caso)

        meuFilme.setNome("Matrix");
        meuFilme.setAnoLancamento(1999);
        meuFilme.setDuracaoMinutos(150);
        meuFilme.setIncluidoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMediaAvaliacoes());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMinutos() + "\n");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2003);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(7);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoMinutos() + "\n");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Resistência");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMinutos(130);
        outroFilme.setIncluidoPlano(true);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total calculado para consumo de conteúdo: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
