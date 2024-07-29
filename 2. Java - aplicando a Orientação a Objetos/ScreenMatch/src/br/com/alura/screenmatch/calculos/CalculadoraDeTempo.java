package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    // Sobrecarga de Métodos
//
//   // 1.
//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoMinutos(); // Metódo da superclasse
//    }
//
//   // 2.
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoMinutos(); // Metódo da superclasse
//    }

    public void inclui(Titulo titulo) { // Não sabemos qual subclasse será chamada ou invocada: conceito de Polimorfismo (muitas formas)
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
