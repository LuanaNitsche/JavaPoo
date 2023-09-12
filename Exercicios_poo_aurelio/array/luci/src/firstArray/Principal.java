package firstArray;


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    private ArrayList<Pessoa> listaNomes;
        
    public Principal() {
        listaNomes = new ArrayList<Pessoa>();
        popular();
        imprimir();
    }
            
    private void popular(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um nome ou \"fim\" para sair");
        String nome = input.next();
        
        while(!nome.equalsIgnoreCase("fim")){
            
            System.out.println("Digite a idade: ");
            int idade = input.nextInt();
            
            Pessoa p = new Pessoa(nome, idade);
            listaNomes.add(p);

            System.out.println("Digite um nome ou \"fim\" para sair");
            nome = input.next();

            input.close();
        }
    }

    private void imprimir(){
        //for (int i = 0; i < listaNomes.size(); i++){
          //      System.out.println(listaNomes.get(i).toString());
            //}

        for(Pessoa p : listaNomes){
            System.out.println(p.toString());
        }
        }
    
    
    public static void main(String[] args) {
        new Principal();

    }

    
}
