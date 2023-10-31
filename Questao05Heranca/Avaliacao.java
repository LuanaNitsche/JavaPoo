package Questao05Heranca;

public class Avaliacao {
    protected int qntPagantes;
    protected String opiniaoGeral;

    public Avaliacao(int qntPagantes, String opiniaoGeral){
        setQntPagantes(qntPagantes);
        setOpiniaoGeral(opiniaoGeral);
    }

    public void setQntPagantes(int qntPagantes){
        this.qntPagantes = qntPagantes;
    }

    public int getQntPagantes(){
        return qntPagantes;
    }

    public void setOpiniaoGeral(String opiniaoGeral){
        this.opiniaoGeral = opiniaoGeral;
    }

    public String getOpiniaoGeral(){
        return opiniaoGeral;
    }
}
