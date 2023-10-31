package Questao04Heranca;

import java.util.ArrayList;

public class Navio extends Embarcacao{
    protected String nome;
    protected ArrayList<Botes> botes; //agregacao parte 1

    public Navio(int registroCap, int qtdadePessoas, String nome, ArrayList<Botes> botes){
        super(registroCap, qtdadePessoas);
        setNome(nome);
        this.botes = new ArrayList<>();  //agregacao parte 2
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void adicionarBotes(Botes umBote){
        botes.add(umBote);  //agregacao parte 3
    }


    private boolean verificarSeguranca(){
        int total = 0;
        //varrer e totalizar a quantidade de pessoas
        for(Botes umBote : botes){
            total += umBote.getQtdadePessoas();
        }
        if(total >= getQtdadePessoas()){
            return true;
        } else {
            return false;
        }
    }

    public String mostrar(){
        String str = super.mostrar() + "\nNome: " + getNome();

        for(Botes umBote : botes){
            str += umBote.mostrar() + "\n";
        }
        
        if(verificarSeguranca()){
            str += "\nNavio atende as normas de segurança";
        } else {
            str += "\nNavio NÃO atende as normas de segurança, número de botes insuficiente";
        }
        return str;

    }
}