package Ex2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        System.out.println("Qual a sua altura?");
        p1.altura = input.nextDouble();

        System.out.println("Qual seu peso?");
        p1.peso = input.nextDouble();

        p1.calcularImc();

    }
}
