package Questao04Heranca;

import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        //Criando um hasmap para armazenar instancias de navios
        HashMap<Integer, Navio> frota = new HashMap<Integer, Navio>(); //chave 'Integer'/'string'

        ArrayList<Botes> bote = new ArrayList<Botes>();
        Navio umNavio = new Navio(768, 1490, "Redenção XIII", bote); 
        Navio doisNavio = new Navio(452, 500, "Roger III", bote);

        Botes umBote = new Botes(5452, 498, false);
        Botes doisBotes = new Botes(2346, 328, true);
        Botes treBotes = new Botes(438, 157, true);
        
        bote.add(umBote);
        bote.add(doisBotes);
        bote.add(treBotes);
        
        System.out.println(umNavio.mostrar());
        System.out.println(doisNavio.mostrar());

        frota.put(umNavio.getRegistroCap(), umNavio);
        frota.put(doisNavio.getRegistroCap(), doisNavio);

        try{
            System.out.println(frota.get(768).mostrar());
        } catch (Exception e) {
            System.out.println("\nNavio inexistente");
        }

    }
}
