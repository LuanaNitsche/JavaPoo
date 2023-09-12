package secondArray;

public class Cadastro {
    private int numSerial;
    private double HD;
    private int memoria;

    public Cadastro(int numSerial, double HD, int Memoria){
        setNumSerial(numSerial);
        setHD(HD);
        setMemoria(Memoria);
    }
    
    public String toString() {
        return "Número serial: " + numSerial + "\nCapacidade HD: " + HD + "\nQuantidade de memória: " + memoria + "\n";
           
    }
    
    public int getNumSerial(){
        return numSerial;
    }

    public double getHD(){
        return HD;
    }

    public int getMemoria(){
        return memoria;
    }

    public void setNumSerial(int numSerial){
        this.numSerial = numSerial;
    }

    public void setHD(double HD){
        this.HD = HD;
    }

    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    
}
