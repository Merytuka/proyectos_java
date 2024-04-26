package model;

import controller.Catalogo;

import java.util.ArrayList;
import java.util.Scanner;

public final class Biblioteca {
    private String nombre, director;
    private Catalogo catalogo;
    public Biblioteca() {
    }
    Scanner teclado = new Scanner(System.in);


    public Biblioteca(String nombre, String director, Catalogo catalogo) {
        this.nombre = nombre;
        this.director = director;
        this.catalogo = catalogo;
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Director: "+director);
        System.out.println("Catalogo: "+catalogo);
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
}
