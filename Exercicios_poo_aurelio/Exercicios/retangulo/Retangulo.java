class Retangulo {
    private Ponto pontoSuperiorEsquerdo;
    private Ponto pontoInferiorDireito;

    public Retangulo(Ponto pontoSuperiorEsquerdo, Ponto pontoInferiorDireito) {
        this.pontoSuperiorEsquerdo = pontoSuperiorEsquerdo;
        this.pontoInferiorDireito = pontoInferiorDireito;
    }

    public double calcularArea() {
        double largura = Math.abs(pontoSuperiorEsquerdo.getX() - pontoInferiorDireito.getX());
        double altura = Math.abs(pontoSuperiorEsquerdo.getY() - pontoInferiorDireito.getY());
        double area = largura * altura;
        return area;
    }
}