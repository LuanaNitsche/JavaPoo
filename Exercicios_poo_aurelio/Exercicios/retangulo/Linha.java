class Linha {
    private Ponto pontoInicial;
    private Ponto pontoFinal;

    public Linha(Ponto pontoInicial, Ponto pontoFinal) {
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
    }

    public Ponto getPontoInicial() {
        return pontoInicial;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }
}