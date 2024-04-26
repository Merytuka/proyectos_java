package model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder


public class Asalariado extends Trabajador implements Serializable {
    protected int numeroPagas;
    @Override
    public void trabajar() {
        System.out.println("Iniciando la jornada");
        System.out.println("Tu número de pagas es"+numeroPagas);
        System.out.println("Que sepas que eres un trabajador");
    }
}
