package model;

import java.io.Serializable;

public final class LibroTerror extends Libro implements Serializable {
    private int calificacion;

    public LibroTerror() {

    }

    public LibroTerror(String isbn, String autor, int numeroPaginas, int calificacion) {
        super(isbn, autor, numeroPaginas);
        this.calificacion=calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Calificación: "+calificacion);
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}

