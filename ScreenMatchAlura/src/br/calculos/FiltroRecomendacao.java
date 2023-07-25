package br.com.alura.screenmatch.calculos;

import java.sql.SQLOutput;

public class FiltroRecomendacao {

    public void filtra(Classificado classificavel) {
        if(classificavel.getClassificacao() == 4){
            System.out.println("Está entre os preferidos do momento.");
        } else if(classificavel.getClassificacao() >= 2){
            System.out.println("Está bem avaliado no momento.");
        } else {
            System.out.println("Guarde na sua lista para depois.");
        }
    }
}
