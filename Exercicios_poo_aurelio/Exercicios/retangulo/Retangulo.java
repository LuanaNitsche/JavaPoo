class Retangulo {
    private Ponto pontoSE;
    private Ponto pontoID;

    public Retangulo(Ponto pontoSE, Ponto pontoID) {
        this.pontoSE = pontoSE;
        this.pontoID = pontoID;
    }

    public double calcularArea() {
        double largura = Math.abs(pontoSE.getX() - pontoID.getX());
        double altura = Math.abs(pontoSE.getY() - pontoID.getY());
        double area = largura * altura;
        return area;
    }

    public boolean pontoEstaDentro(Ponto ponto) {
        double x = ponto.getX();
        double y = ponto.getY();

        double minX = Math.min(pontoSE.getX(), pontoID.getX());
        double maxX = Math.max(pontoSE.getX(), pontoID.getX());
        double minY = Math.min(pontoSE.getY(), pontoID.getY());
        double maxY = Math.max(pontoSE.getY(), pontoID.getY());

        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }

    public boolean linhaEstaDentro(Linha linha) {
        Ponto pontoInicial = linha.getPontoInicial();
        Ponto pontoFinal = linha.getPontoFinal();

        return pontoEstaDentro(pontoInicial) && pontoEstaDentro(pontoFinal);
    }
}