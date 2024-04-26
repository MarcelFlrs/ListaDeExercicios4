package br.edu.up;

import br.edu.up.models.Livro;

public class Programa {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Core java 2");
        livro1.setCodigo("1598FHK");
        livro1.setAutores("Cay S. Horstmann e Gary Cornell");
        livro1.setIsbn("0130819336");
        livro1.setAno(2005);

        System.out.println("Livro 01: ");
        System.out.println("Código: " + livro1.getCodigo());
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autores: " + livro1.getAutores());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Ano: " + livro1.getAno()+ "\n");
       

    }
}
