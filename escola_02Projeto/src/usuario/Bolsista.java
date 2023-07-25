package Aula11;

public class Bolsista extends Aluno{

    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Bolsa do aluno " + this.getNome() + " renovada." );
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
