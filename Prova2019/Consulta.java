package Prova2019;
import java.util.Date;


public class Consulta {
    private int codigo;
    private Paciente paciente;
    private Medico medico;
    private Date dia;
    private double valor;

    public Consulta(int codigo, Paciente paciente, Medico medico, Date dia, double valor){
        setCodigo(codigo);
        setPaciente(paciente);
        setMedico(medico);
        setDia(dia);
        setValor(valor);
    }

    public void setCodigo (int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setDia(Date dia){
        this.dia = dia;
    }

    public Date getDia(){
        return dia;
    }

    public void setPaciente(Paciente umPaciente){
        this.paciente = umPaciente;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void setMedico(Medico umMedico){
        this.medico = umMedico;
    }

    public Medico getMedico(){
        return medico;
    }

    public void setValor(double valor){
        valor = 250.0;
        Plano plano = getPaciente().getPlano();
        if(plano instanceof Prata || plano instanceof Ouro){
            this.valor = plano.calculaValor(valor);
        } else {
            this.valor = valor;
        }
    }

    public double getValor(){
        return valor;
    }

    public String toString(){
        return "\nConsulta de número " + getCodigo() +
        "\nPaciente: " + getPaciente().getNome() +
        "\nMedico: " + getMedico().getNome() +
        "\nData da consulta: " + getDia() +
        "\nValor: R$" + getValor();
    }
}
