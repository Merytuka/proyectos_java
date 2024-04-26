package controller;


import model.Libro;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Libro> libros;
    private int tamano;


    public Catalogo(int tamano) {
        this.tamano = tamano;
        this.libros = new ArrayList<>();
    }


    public void agregarLibro(Libro libro) throws Exception {

        if(libros.size()<tamano) {
            libros.add(libro);
        }else {
            throw new Exception("Ha superado el límite de libros en el catálogo");
        }
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        libros.remove(libro);
    }

    public Libro buscarLibroPorISBN(String Isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(Isbn)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
