import escola.Aluno;
import escola.Funcionario;
import escola.Pessoa;
import escola.Professor;

public class Principal {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.descricao());
        System.out.println(p2.descricao());
        System.out.println(p3.descricao());
        System.out.println(p4.descricao());

        p1.fazerAniversario();
        p2.cancelarMatricula();
        p3.receberAumento(500);
        p4.mudarTrabalho();

        System.out.println(p1.descricao());
        System.out.println(p2.descricao());
        System.out.println(p3.descricao());
        System.out.println(p4.descricao());


    }
}