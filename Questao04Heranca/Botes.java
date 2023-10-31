package Questao04Heranca;

public class Botes extends Embarcacao{
    protected boolean inflavel;

    public Botes(int registroCap, int qtdadePessoas, boolean inflavel){
        super(registroCap, qtdadePessoas);
        setInflavel(inflavel);

    }

    public void setInflavel(boolean inflavel){
        this.inflavel = inflavel;
    }

    public boolean getInflavel(){
        return inflavel;
    }

    public String mostrar(){
        if( getInflavel()){
            return super.mostrar() + "\nInflável";
        }
        return super.mostrar() + "\nNão inflável";
    }
}
