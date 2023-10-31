package Prova2019;

public class Ouro extends Plano{
    public Ouro(String nomePlano, int ano, int dependentes){
        super(nomePlano, ano, dependentes);
    }

    public String toString(){
        return "\nPlano tipo: Ouro" + super.toString();
    }

    @Override
    public double calculaValor(double valor){
        if(getDependentes() >= 2){
            return valor * 0.5;
        } else {
            return valor * 0.6;
        }
    }

}
