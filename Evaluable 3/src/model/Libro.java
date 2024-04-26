package model;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Libro implements Serializable {
    private String isbn;
    private String autor;
    private int numeroPaginas;

    public Libro() {

    }

    public Libro(String isbn, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDatos(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Autor: "+autor);
        System.out.println("Número de páginas: "+numeroPaginas);
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

