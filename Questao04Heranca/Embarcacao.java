package Questao04Heranca;

public abstract class Embarcacao {
    protected int registroCap, qtdadePessoas;

    public Embarcacao(int registroCap, int qtdadePessoas){
        setRegistroCap(registroCap);
        setQtdadePessoas(qtdadePessoas);
    }

    public void setRegistroCap(int registroCap){
        this.registroCap = registroCap;
    }

    public void setQtdadePessoas(int qtdadePessoas){
        this.qtdadePessoas = qtdadePessoas;
    }

    public int getRegistroCap(){
        return registroCap;
    }

    public int getQtdadePessoas(){
        return qtdadePessoas;
    }

    public String mostrar(){
        return "\nRegistro: " + getRegistroCap() +
        "\nQuantidade de pessoas: " + getQtdadePessoas();
    }
}
