package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Matrix", 1999);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Resitência", 2023);
        outroFilme.avalia(7.5);
        var filmeAndre = new Filme("O Senhor dos Anéis", 2001);
        filmeAndre.avalia(10);
        Serie lost = new Serie("Lost", 2003);

        Filme f1 = filmeAndre; // Variáveis de referência: aponta para o mesmo objeto que foi atribuído, ou seja, caso altere está variável a mesma altera também o objeto de referência original!

        ArrayList<Titulo> lista = new ArrayList<>(); // O ArrayList se trata de um objeto que guarda uma lista que por trás dela é um Array
        lista.add(filmeAndre);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println("\n" + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                //Filme filme = (Filme) item;
                System.out.println("\nClassificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Keanu Reeves");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Robert Downey Jr.");
        buscaPorArtista.add("Johnny Depp");

        System.out.println("\n" + buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("\nApós a ordenação: \n" + buscaPorArtista);

        Collections.sort(lista);

        System.out.println("\nLista de títulos ordenados por Título: \n" + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));

        System.out.println("\nLista de títulos ordenados por Ano: \n" + lista);
    }
}
