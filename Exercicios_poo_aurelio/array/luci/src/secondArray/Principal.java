package secondArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Cadastro> listaComp;
    
    public Principal(){
        listaComp = new ArrayList<Cadastro>();
        addComp();
        imprimir();
    }

    public void addComp(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número serial do computador ou \"0\" para sair: ");
        int numSerial = input.nextInt();

        while(numSerial != 0){
            System.out.println("Digite a capacidade do HD: ");
            double HD = input.nextDouble();

            System.out.println("Digite a quantidade de memória: ");
            int memoria = input.nextInt();

            Cadastro c = new Cadastro(numSerial, HD, memoria);
            listaComp.add(c);

            System.out.println("Insira o número serial do computador ou \"0\" para sair: ");
            numSerial = input.nextInt();


            
        }
        input.close();
    }

    public void imprimir(){
        for(Cadastro c : listaComp){
            System.out.println(c.toString());
        }
    }
    public static void main(String[] args) {
        new Principal();
    }


}
