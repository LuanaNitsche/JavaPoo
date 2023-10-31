package Prova2019;

import java.util.ArrayList;

public class Paciente extends Pessoa{
    private ArrayList<Plano> planos;

    public Paciente(String nome, ArrayList<Plano> planos){
        super(nome);
        planos = new ArrayList<Plano>();
    }

    public void adicionarPlano(Plano plano){
        planos.add(plano);   
    }

    public Plano getPlano(){
        if (!planos.isEmpty()){
            return planos.get(0);
        } else {
            return null;
        }
    }

    public String toString(){
        String str = "\nNome: " + getNome();
        for(Plano umPlano : planos){
            str += umPlano.toString();
        }
        return str;
    }
}
