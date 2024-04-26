package model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder




public abstract class Trabajador extends Persona implements Serializable {
    protected int salario;
    public abstract void trabajar();


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("salario= "+salario);
    }
}
