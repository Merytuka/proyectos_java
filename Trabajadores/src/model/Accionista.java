package model;

public class Accionista extends Persona implements Responsable {
    @Override
    public void realizarVotacion() {
        System.out.println("El Accionista ha entrado en escena y votará");
        int aleatorio = (int) (Math.random()*10)*2;
        System.out.println("El voto supremo del accionista es : "+aleatorio);
    }
}
