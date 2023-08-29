package Exercicios.Cinema;
import java.util.Date;

public class EntradaCinema {
    private String dataFilme;
    private int horario;
    private int sala;
    private double valor;

    public EntradaCinema(String dataFilme, int horario, int sala, double valor) {
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    public void calculaDesconto(Date data, int carteira){
        if (data.getYear() > 2011){
            valor -= valor/2;
        } else if (data.getYear() <= 2011 && data.getYear() >= 2008) {
            valor -= valor * 0.4;
        } else if (data.getYear() )
    }






    public String getDataFilme() {
        return dataFilme;
    }

    public void setDataFilme(String dataFilme) {
        this.dataFilme = dataFilme;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
