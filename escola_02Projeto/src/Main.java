import Aula11.*;

public class Main {
    public static void main(String[] args) {
       Visitante v1 = new Visitante();
       v1.setNome("Felipe");
       v1.setIdade(18);
       v1.setSexo("M");
       v1.fazerAniversario();
       System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Amanda");
        a1.setIdade(21);
        a1.setSexo("F");
        a1.setCurso("Matemática");
        a1.setMatricula(123);
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setNome("Fernanda");
        b1.setIdade(19);
        b1.setSexo("F");
        b1.setCurso("Fisioterapia");
        b1.setBolsa(12.5f);
        b1.setMatricula(321);
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Caio");
        p1.setIdade(23);
        p1.setSexo("M");
        p1.setEspecialidade("Engenharia de materiais");
        p1.setSalario(2500);
        p1.receberAumento(500);

        Tecnico t1 = new Tecnico();
        t1.setNome("Frederico");
        t1.setIdade(32);
        t1.setSexo("M");
        t1.setMatricula(456);
        t1.pagarMensalidade();
        

    }
}