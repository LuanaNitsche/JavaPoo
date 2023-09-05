package Exercicios.Funcionario;

public class Funcionario {
    private String nome;
    private double salario;
    double imposto = 0;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularIrpf() {
    
        if (salario <= 1903.98) {
            imposto = 0;
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075;
            
        } else if (salario <= 3751.05) {
            imposto = (salario - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
            
        } else if (salario <= 4664.68) {
            imposto = (salario - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
            
        } else {
            imposto = (salario - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
            
        }

        return imposto;
    }

    public double imprimeSalario(){
        double novoSalario = salario - imposto;
        return novoSalario;

    }

    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }
}
