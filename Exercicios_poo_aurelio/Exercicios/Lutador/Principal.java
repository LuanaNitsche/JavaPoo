package Exercicios.Lutador;

public class Principal {

    public static void main(String[] args) {
        Lutador l = new Lutador("João", 65);
        l.categoria();
        System.out.println(l.imprimir());

        Lutador outroL = new Lutador("Xandinho", 84);
        outroL.categoria();
        System.out.println(outroL.imprimir());
    }
}
