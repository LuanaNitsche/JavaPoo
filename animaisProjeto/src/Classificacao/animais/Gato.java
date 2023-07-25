package Classificacao.animais;

import Classificacao.Animal;
import Classificacao.Mamifero;

public class Gato extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }
}
