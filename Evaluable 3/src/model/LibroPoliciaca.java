package model;

import java.io.Serializable;

public final class LibroPoliciaca extends Libro implements Serializable {

    private Trama trama;
    private String[] personajes;

    public LibroPoliciaca() {
    }

    public LibroPoliciaca(String isbn, String autor, int numeroPaginas, Trama trama, String[] personajes) {
        super(isbn, autor, numeroPaginas);
        this.trama = trama;
        this.personajes = personajes;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Trama: "+trama);
        for (String personajes : personajes){
            System.out.println("Personaje: "+personajes);
        }
    }

    public Trama getTrama() {
        return trama;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }

    public String[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String[] personajes) {
        this.personajes = personajes;
    }
}
