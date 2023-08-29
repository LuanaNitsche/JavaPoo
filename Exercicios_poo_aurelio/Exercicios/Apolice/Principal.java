package Exercicios.Apolice;

public class Principal {
    public static void main(String[] args) {
        Apolice umaApolice = new Apolice("Luana", 27, 900.0);
        System.out.println(umaApolice.imprimir());
        umaApolice.calculaPremio();
        System.out.println(umaApolice.imprimir());
        umaApolice.oferecerDesconto("Blumenau");
        System.out.println(umaApolice.imprimir());


    }
}
