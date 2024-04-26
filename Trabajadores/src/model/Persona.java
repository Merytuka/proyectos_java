package model;

import lombok.*;

import java.io.Serializable;

//poniendo lo de abajo creo todo a través de la librería, no tengo que hacer nada mas. Si a errores revisar el plugin de lombok
//constructor vacio
//constructor con todo
//getter setter
// usamos la libreria lombok projectlombok.org file pogect structure
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public abstract class Persona implements Serializable {
    protected  String dni, nombre, correo;

    public void mostrarDatos(){
        System.out.println("dni= "+dni);
        System.out.println("nombre= "+nombre);
        System.out.println("correo= "+correo );

    }

}
