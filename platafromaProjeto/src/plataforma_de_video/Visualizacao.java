package plataforma_de_video;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float por){
        int totalAssistido = 0;
        if(por <= 20){
            totalAssistido = 3;
        } else if (por > 20 && por <= 70){
            totalAssistido = 6;
        } else {
            totalAssistido = 10;
        }
        this.filme.setAvaliacao(totalAssistido);
    }

    @Override
    public String toString() {
        return "\nVisualizacao { " +
                "espectador = " + espectador +
                ", filme = " + filme +
            " } ";
    }
}
