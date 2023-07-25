import controle.ControleRemoto;

public class Principal {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.fecharMenu();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
    }
}
