package Exercicios.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Fernando", 3000);
        System.out.println(f.calcularIrpf());
        System.out.println(f.getSalario());
        System.out.println(f.imprimeSalario());
    }
}
