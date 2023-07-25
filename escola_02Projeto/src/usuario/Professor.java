package Aula11;

public class Professor extends Pessoa{

    private String especialidade;
    private float salario;
    public void receberAumento(int j){
        this.setSalario(this.getSalario() + j);
        System.out.println("Salário ajustado para R$" + this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
