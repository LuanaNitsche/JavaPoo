package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificado;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome; //atributo igual
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){

        System.out.println("Título: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Tempo de duração: " + duracaoEmMinutos);

    }

    public void avalia(double nota){
        somaDaAvaliacao += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){
        return somaDaAvaliacao / totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}


