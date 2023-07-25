package br.com.livraria;

public class Livro implements Publicacao {
    private String livro;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro { " +
                "Livro = " + livro + "\n"+
                "Autor = " + autor + "\n" +
                "TotalPag = " + totalPag + "\n" +
                "PagAtual = " + pagAtual + "\n" +
                "Aberto = " + aberto + "\n" +
                "Leitor = " + leitor.getNome() + "\n" +
                "Idade = " + leitor.getIdade() + "\n" +
                "Sexo = " + leitor.getSexo() + "\n" +
                " } ";
    }

    public Livro(String livro, String autor, int totalPag, Pessoa leitor) {
        this.livro = livro;
        this.autor = autor;
        this.totalPag = totalPag;
        this.leitor = leitor;
    }

    public String getLivro() {
        return this.livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return this.totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //metodos interface

    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("Livro aberto ");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("Livro fechado ");
    }

    @Override
    public void folhear(int p) {
        if(p <= this.getTotalPag()){
            this.pagAtual = p;
            System.out.println("Página atual: " + this.pagAtual);
    } else {
            System.out.println("Essa página não existe.");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() == this.getTotalPag()){
            System.out.println("Acabaram as páginas!");
        } else if (this.getPagAtual() >= 0) {
            this.pagAtual++;
            System.out.println("Página atual: " + this.getPagAtual());
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() == 0){
            System.out.println("Você está na primeira página!");
        } else if (this.getPagAtual() <= this.getTotalPag()){
            this.pagAtual--;
            System.out.println("Página atual: " + this.pagAtual);
        } else {
            System.out.println("Não foi possível voltar página.");
        }
    }
}
