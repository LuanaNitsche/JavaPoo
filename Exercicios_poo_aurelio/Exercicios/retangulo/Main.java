public class Main {
    public static void main(String[] args) {
        Ponto pontoSuperiorEsquerdo = new Ponto(1.0, 4.0);
        Ponto pontoInferiorDireito = new Ponto(5.0, 2.0);

        Retangulo retangulo = new Retangulo(pontoSuperiorEsquerdo, pontoInferiorDireito);

        Ponto pontoDentro = new Ponto(3.0, 3.0);
        Ponto pontoFora = new Ponto(6.0, 5.0);

        Linha linhaDentro = new Linha(new Ponto(2.0, 3.0), new Ponto(4.0, 3.0));
        Linha linhaFora = new Linha(new Ponto(6.0, 3.0), new Ponto(7.0, 4.0));

        System.out.println("Ponto dentro do retângulo: " + retangulo.pontoEstaDentro(pontoDentro)); // Deve imprimir true
        System.out.println("Ponto fora do retângulo: " + retangulo.pontoEstaDentro(pontoFora)); // Deve imprimir false

        System.out.println("Linha dentro do retângulo: " + retangulo.linhaEstaDentro(linhaDentro)); // Deve imprimir true
        System.out.println("Linha fora do retângulo: " + retangulo.linhaEstaDentro(linhaFora)); // Deve imprimir false
    }
}