package model;

import java.io.Serializable;

public final class LibroComedia extends Libro implements Serializable {

    private String tipoHumor;

    public LibroComedia() {
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de Humor: "+ tipoHumor);
    }

    public LibroComedia(String isbn, String autor, int numeroPaginas, String tipoHumor) {
        super(isbn, autor, numeroPaginas);
        this.tipoHumor = tipoHumor;
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
