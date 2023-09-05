public class ContaCorrente {

    private String nome;
    private double saldo;

    public ContaCorrente(){
       setContaCorrente("Sem nome", 0.0);
    }

    public ContaCorrente(String nome){
        setContaCorrente(nome, 0.0);
    }

    public ContaCorrente(String nome, double saldo){
        setContaCorrente(nome, saldo);
    }
    
    public void setContaCorrente(String nome, double saldo){
        setNome(nome);
        setSaldo(saldo);
    }

    public String getStatusContaCorrente(){
        return nome + " seu saldo atual é de " + saldo;    }

    public boolean fazerDeposito(double valor){
        if(valor >= 0){
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean fazerRetirada(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean fazerTransferencia(ContaCorrente destino, double valor){
        if (fazerRetirada(valor)){
            destino.fazerDeposito(valor);
            return true;
        } else {
            return false;
        }
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   
    public String getNome() {
        return nome;
    }

    
    public double getSaldo() {
        return saldo;
    }
}


