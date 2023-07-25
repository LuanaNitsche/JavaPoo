package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificado;

public class Filme extends Titulo implements Classificado { //todo filme é um titulo
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
       return (int) pegaMedia()/2;

    }
}