package br.com.livraria;

import br.com.livraria.Livro;
import br.com.livraria.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Helena", 20, "F");
        p[1] = new Pessoa("Luana", 20, "F");
        p[2] = new Pessoa("Sandra", 52, "F");

        l[0] = new Livro("A baleia", "Pedro Kraus", 250, p[0]);
        l[1] = new Livro("O pequeno príncipe", "Antoine", 110, p[1]);
        l[2] = new Livro("Bblioteca da meia-noite", "Matt Haig", 300, p[2]);

        System.out.println(l[0].detalhes());
        l[0].folhear(0);
        l[0].voltarPag();






    }

}