package Exercicios.Lutador;

public class Lutador {
    private String nome;
    private double peso;

    public Lutador(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String categoria(){
        if(peso <= 54){
            return "(Pluma)";
        } else if (peso <= 60) {
            return "(Leve)";
        } else if (peso <= 75){
            return "(Meio-leve)";
        } else {
            return"(Pesado)";
        }
    }
    public String imprimir(){
        return "O lutador " + this.nome + " está na categoria " + categoria();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
