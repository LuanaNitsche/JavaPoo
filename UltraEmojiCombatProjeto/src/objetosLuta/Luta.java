import uec_curso_em_video.Lutador;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
            if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
                this.aprovada = true;
                this.desafiado = l1;
                this.desafiante = l2;
            } else {
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }
    }
    public void lutar(){
            if (this.aprovada){
                this.desafiado.apresentar();
                this.desafiante.apresentar();
                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3);

                switch(vencedor){
                    case 0:
                        System.out.println("Empatou");
                        desafiante.empatarLuta();
                        desafiado.empatarLuta();
                        break;
                    case 1:
                        System.out.println(desafiado.getNome() + " ganhou!");
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        break;
                    case 2:
                        System.out.println(desafiante.getNome() + " ganhou!");
                        desafiante.ganharLuta();
                        desafiado.perderLuta();
                        break;
                }

            } else {
                System.out.println("Luta não pode acontecer!");
            }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }
}
