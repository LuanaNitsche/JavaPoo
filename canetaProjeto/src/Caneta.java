package testeCaneta;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Status: " + this.tampada);
    }

    public void rabiscar(){
        if(tampada == true){
            System.out.println("Caneta tampada, não consigo rabiscar");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    private void tampar(){
        this.tampada = true;
        System.out.println("Caneta tampada.");
    }

    private void destampar(){
        this.tampada = false;
        System.out.println("Caneta destampada.");
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
}


