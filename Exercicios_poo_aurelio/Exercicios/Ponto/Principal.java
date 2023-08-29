package Exercicios.Ponto;

public class Principal {
    public static double calculaDistancia(Ponto p1, Ponto p2){ //calculo da diferenca entre x1 e x2, e, y1 e y1 ao quadrado
        double diferX = Math.pow(p1.getX() - p2.getX(), 2);
        double diferY = Math.pow(p1.getY() - p2.getY(), 2);

        return Math.sqrt(diferX + diferY);
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto(5, 9);
        Ponto p2 = new Ponto(1, 2);

        System.out.println("Distância calculada: " + calculaDistancia(p1, p2));


    }
}
