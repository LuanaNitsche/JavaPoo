package Exercicios.Apolice;

public class Apolice {
    private String nome;
    private int idade;
    private double valorPremio;

    public Apolice(String nome, int idade, double valorPremio) {
        this.nome = nome;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public String imprimir(){
    return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nValor prêmio: " + valorPremio;

    }

    public void calculaPremio(){
        if (idade >= 18 && idade <= 25){
            valorPremio += (valorPremio * 20) / 100;
        } else if(idade <= 36){
            valorPremio += (valorPremio * 15) / 100;
        } else {
            valorPremio += (valorPremio * 10) / 100;
        }
    }

    public void oferecerDesconto(String cidade){
        if (cidade == "Ilhota"){
            valorPremio -= valorPremio * 0.05;
        } else if (cidade == "Blumenau"){
            valorPremio -= valorPremio * 0.03;
        } else if (cidade == "Itajaí"){
            valorPremio -= valorPremio * 0.01;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
}