package Questao05Heranca;

public class ShowMusical {
    protected String artista, estiloMusical;

    public ShowMusical(String artista, String estiloMusical){
        setArtista(artista);
        setEstiloMusical(estiloMusical);
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public void setEstiloMusical(String estiloMusical){
        this.estiloMusical = estiloMusical;
    }

    public String getArtista(){
        return artista;
    }

    public String getEstiloMusical(){
        return estiloMusical;
    }
}
