package Prova2019;

public class Prata extends Plano{
    public Prata(String nomePlano, int ano, int dependentes){
        super(nomePlano, ano, dependentes);
    }

    public String toString(){
        return "\nPlano tipo: Prata" + super.toString();
    }

    @Override
    public double calculaValor(double valor){
        if(getAno() < 2000){
            return valor * 0.7;
        } else {
            return valor * 0.8;
        }
    }
}
