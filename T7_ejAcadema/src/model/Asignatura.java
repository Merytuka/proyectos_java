package model;

public class Asignatura {

    private int id;
    private double calficacion;
    public Asignatura(){}
    public Asignatura(int id){
        this.id=id;


    }
    public void mostrarDatos{
        System.out.println("ID:"+id);
        System.out.println("Calificaciion: "+calficacion);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalficacion() {
        return calficacion;
    }

    public void setCalficacion(double calficacion) {
        this.calficacion = calficacion;
    }
}
