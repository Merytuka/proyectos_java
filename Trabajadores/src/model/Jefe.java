package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Jefe extends Trabajador implements Responsable, Serializable {
    private int percAcciones;
    private Puesto puesto;

    @Override
    public void trabajar() {
        System.out.println("El jefe se pone a trabjar");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("perAcciones= "+percAcciones);
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El jefe se dispone a votar");
        int aleatorio = (int) (Math.random()*5)/2;
        System.out.println("El voto del jefe es : "+aleatorio);
    }
}
