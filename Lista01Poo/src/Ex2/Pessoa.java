package Ex2;

public class Pessoa {
    public double peso;
    public double altura;

    public void calcularImc(){
        double imc = this.peso / (this.altura * this.altura);
        System.out.println(imc);

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

    }

}
