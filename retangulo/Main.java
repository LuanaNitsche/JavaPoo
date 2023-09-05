public class Main {
    public static void main(String[] args) {
        Ponto pontoSuperiorEsquerdo = new Ponto(1.0, 4.0);
        Ponto pontoInferiorDireito = new Ponto(5.0, 2.0);

        Retangulo retangulo = new Retangulo(pontoSuperiorEsquerdo, pontoInferiorDireito);
        double areaDoRetangulo = retangulo.calcularArea();
        System.out.println("A área do retângulo é " + areaDoRetangulo);
    }
}