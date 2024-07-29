package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomandacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Classificação: Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Classificação: Muito bem avaliado no momento!");
        } else {
            System.out.println("Classificação: Coloque em sua lista para assistir depois");
        }
    }
}
