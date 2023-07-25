package testeCaneta;

public class teste {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.setPonta(0.5f);
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();




        System.out.println("  ");

        Caneta c2 = new Caneta();
        c2.modelo = "Stabilo";
        c2.cor = "Rosa";
        c2.setPonta(1.0f);
        c2.carga = 100;
        c2.tampada = false;
        c2.status();
        c2.rabiscar();






    }
}
