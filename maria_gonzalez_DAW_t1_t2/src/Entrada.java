

public class Entrada {
    public static void main(String[] args) {
        Coche Corredor1 = new Coche("Renault", "R5", "3456MRD", 110, 110, 0, 0);

        Coche Corredor2 = new Coche("Ford", "Mondeo", "KKS5478", 95, 95, 0, 0);

        Carrera carrera = new Carrera(Corredor1, Corredor2, 110, 5);

        System.out.println(carrera.mostrarParticipantes());

        System.out.println("🚥 LA CARRERA VA A COMENZAR 🚥");


        carrera.iniciarCarrera();

        System.out.println("🏁LA CARRERA HA FINALIZADO🏁\nGANADOR: ");

        System.out.println(carrera.mostrarDatosGanador());


    }


}
