import Classificacao.*;
import Classificacao.animais.*;

public class Main {
    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Canguru c = new Canguru();
        Gato g = new Gato();
        Cobra cb = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish gf = new GoldFish();
        Arara ar = new Arara();
        cb.setCorEscama("Verde");
        cb.locomover();
        g.emitirSom();
        t.locomover();
        c.locomover();
    }
}