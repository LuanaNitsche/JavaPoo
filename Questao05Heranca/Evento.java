package Questao05Heranca;
import java.util.Date;

public class Evento {
    protected String titulo;
    protected double valorIngresso;
    protected Date data;

    public Evento(String titulo, double valorIngresso, Date data){
        setTitulo(titulo);
        setValorIngresso(valorIngresso);
        setData(data);
    }

    private String mostrar(){
        return "\nTítulo: " + getTitulo() +
               "\nValor ingresso: " + getValorIngresso() +
               "\nData: " + getData();
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setData(Date data){
        this.data = data;
    }

    public Date getData(){
        return data;
    }

    public void setValorIngresso(double valorIngresso){
        this.valorIngresso = valorIngresso;
    }

    public double getValorIngresso(){
        return valorIngresso;
    }
}
