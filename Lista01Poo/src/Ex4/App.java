package Ex4;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p[] = new Pessoa[3];

        for (int i = 0; i < 3; i++){
            p[i] = new Pessoa();
            System.out.println("Qual o seu nome?");
            p[i].nome = input.nextLine();

            System.out.println("Qual a sua altura?");
            p[i].altura = input.nextDouble();

            System.out.println("Qual o seu peso?");
            p[i].peso = input.nextDouble();
            input.nextLine();
        }

        p[0].calcularImc();
        p[1].calcularImc();
        p[2].calcularImc();

        for (int i = 2; i >=0; i--){
            System.out.println("Usuário: " + p[i].nome + "\nAltura: " + p[i].altura + "m" + "\nPeso: " + p[i].peso +
                    "\nImc: " + p[i].imc);
        }
    }
}
