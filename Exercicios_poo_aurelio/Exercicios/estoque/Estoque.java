package Exercicios.estoque;

public class Estoque {
    private int codigo;
    private double valor;
    private int quantidade;

    public Estoque(int codigo, double valor, int quantidade) {
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void adicionarProduto(int quantidade){
        if (quantidade > 0){
            this.quantidade += quantidade;
        }

    }

    public boolean verificaDisponibilidade(int i) {
        if (quantidade >= 0 && quantidade >= i){
            return true;
        } else {
            return false;
        }
    }

    public boolean retirarProduto(int quantidadeP){
        if (verificaDisponibilidade(quantidadeP)){
            quantidade -= quantidadeP;
            return true;
        } else {
            return false;
        }
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
