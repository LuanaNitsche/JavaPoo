package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificado;

public class Episodios implements Classificado {

    private int numero;
    private String nome;
    private Serie serie;
    private int visualizacoes;

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {

        if (visualizacoes > 100){
        return 4; //estrelas
        } else {
        return 2;

        }

    }
}
