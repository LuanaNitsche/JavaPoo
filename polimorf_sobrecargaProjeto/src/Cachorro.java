import java.util.Objects;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase){
        if(Objects.equals(frase, "Toma comida") || Objects.equals(frase, "Olá")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int minuto){
        if(hora >= 5 && hora <= 12){
            System.out.println("Abanar");
        } else if(hora >= 12 && hora <= 18){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Igonorar");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }

    }
    public void reagir(int idade, float peso){
        if(idade >= 0 && idade <= 3 && peso <= 6){
            System.out.println("Abanar");
        } else if (idade >= 0  && idade <= 3 && peso >= 6){
            System.out.println("Latir");
        } else if (idade >= 4 && peso <= 6){
            System.out.println("Rosnar");
        } else if (idade >= 4 && peso >= 6){
            System.out.println("Ignorar");
        }
    }
}
