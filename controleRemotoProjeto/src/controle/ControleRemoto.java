package controle;

public class ControleRemoto {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    //abstratos

    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println("-----------MENU-----------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for(int i = 0; i <= this.getVolume(); i+= 10){
            System.out.print("|");
        }

    }
    public void fecharMenu(){
        System.out.println("\n-----------FECHANDO MENU-----------");
    }
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        } else {
            System.out.println("Volume já está no mínimo");
        }
    }
    public void desligaMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        } else {
            System.out.println("Não está no mudo");
        }
    }
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não foi possível dar play. Já está tocando.");
        }
    }
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Já está pausado");
        }
    }









}
