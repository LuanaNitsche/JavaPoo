package Ex4;

public class Pessoa {
    public double peso;
    public double altura;
    public String nome;

    double imc;

    public void calcularImc(){
        imc = peso / (altura * altura);
        System.out.println("Seu imc é: " + imc);
    }
}
