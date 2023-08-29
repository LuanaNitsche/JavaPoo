package Exercicios.estoque;

public class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque e = new Estoque(1000, 45, 0);
        e.adicionarProduto(1000);
        System.out.println(e.verificaDisponibilidade(5000));
        System.out.println(e.retirarProduto(300));
    }
}
