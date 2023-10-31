package Prova2019;

public class Plano {
    private String nomePlano;
    private int ano, dependentes;

    public Plano(String nomePlano, int ano, int dependentes){
        setNomePlano(nomePlano);
        setAno(ano);
        setDependentes(dependentes);
    }

    public String getNomePlano(){
        return nomePlano;
    }

    public void setNomePlano(String nomePlano){
        this.nomePlano = nomePlano;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getDependentes(){
        return dependentes;
    }

    public void setDependentes(int dependentes){
        this.dependentes = dependentes;
    }

    public double calculaValor(double valor){
        return valor;
    };

    public String toString(){
        return "\nNome do plano: " + getNomePlano() +
        "\nAno de início: " + getAno() +
        "\nNúmero de dependentes: " + getDependentes();
    }
}
