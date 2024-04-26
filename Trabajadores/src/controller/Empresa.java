package controller;

import lombok.NoArgsConstructor;
import model.Persona;
import model.Responsable;
import model.Trabajador;

import java.io.Serializable;
import java.util.ArrayList;
@NoArgsConstructor

public class Empresa implements Serializable {
    ArrayList<Persona> listaPersonas;

    public void agregarPersona (Persona persona){
        listaPersonas.add(persona);
    }
    public void empezarJornadaLaboral(){
        for (Persona item: listaPersonas) {
            if (item instanceof Trabajador){
                ((Trabajador) item).trabajar();
            }

        }
    }
    public void realizarVotacion(){
        for (Persona item: listaPersonas) {
            if(item instanceof Responsable){
                ((Responsable) item).realizarVotacion();
            }

        }

}}
