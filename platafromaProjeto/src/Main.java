import plataforma_de_video.Gafanhoto;
import plataforma_de_video.Video;
import plataforma_de_video.Visualizacao;

public class Main {
    public static void main(String[] args) {

    Video   v[] = new Video[3];
    Gafanhoto g[] = new Gafanhoto[3];
    v[0] = new Video("Poo Java: Aula 01");
    v[1] = new Video ("As aventuas de Peppa Pig");
    v[2] = new Video("Os segredos do investimento seguro");
    g[0] = new Gafanhoto("Luana",20, "F", "Joabeba");
    g[1] = new Gafanhoto("Helena", 21, "F", "h.slva");
    g[2] = new Gafanhoto("Lucas", 27, "M", "stitch");

       // System.out.println(v[0].toString());
       // System.out.println(g[1].toString());
        //v[1].getCurtidas();
        //v[2].setCurtidas(3);
        //v[0].pause();
        //System.out.println(v[2].toString());
        //System.out.println(v[0].toString());

        Visualizacao w[] = new Visualizacao[5];
        w[0] = new Visualizacao(g[0], v[0]);
        w[0].avaliar(8);
        System.out.println(w[0].toString());
        w[1] = new Visualizacao(g[0], v[1]);
        w[1].avaliar(70.0f);
        System.out.println(w[1].toString());





    }
}