package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { // Classe —> Objeto que implementa uma interface
        private String diretor;

        public String getDiretor() {
                return diretor;
        }

        public void setDiretor(String diretor) {
                this.diretor = diretor;
        }

        @Override
        public int getClassificacao() {
                return (int) pegaMediaAvaliacoes()/2; // (int) se trata de um casting (conversão), está conversão de tipo ocorre quando você atribui um valor de um tipo de dados primitivo a outro tipo
        }
}

