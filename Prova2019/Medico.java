package Prova2019;

import java.util.ArrayList;

public class Medico extends Pessoa{
    private int CRM;
    private String especialidade;
    private ArrayList<Paciente> pacientes;

    public Medico(String nome, int CRM, String especialidade, ArrayList<Paciente> pacientes){
        super(nome);
        setCRM(CRM);
        setEspecialidade(especialidade);
        pacientes = new ArrayList<Paciente>();
    }

    public void setCRM(int CRM){
        this.CRM = CRM;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public int getCRM(){
        return CRM;
    }

    public void adicionarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    public String toString(){
        String str = "\nNome: " + getNome() + "\nCRM: " + getCRM() + "\nEspecialidade: " + getEspecialidade();
        for(Paciente umPaciente : pacientes){
            str += umPaciente.toString();
        }
        return str;
    }

}
