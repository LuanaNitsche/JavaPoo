package Ex3;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p.calcularImc(input);
        p1.calcularImc(input);
        p2.calcularImc(input);

    }
}
