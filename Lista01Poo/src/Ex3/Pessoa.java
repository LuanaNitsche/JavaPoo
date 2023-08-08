package Ex3;
import java.util.Scanner;

public class Pessoa {
    public double peso;
    public double altura;

    public void calcularImc(Scanner input){
        System.out.println("Qual a sua altura?");
        altura = input.nextDouble();
        System.out.println("Qual o seu peso?");
        peso = input.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu imc é de " + imc);

        if(imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Normal");
        } else if (imc > 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else if (imc > 40) {
            System.out.println("Obesidade grau III");
        }

        System.out.println("--------------------");
        System.out.println(" ");


    }

}
