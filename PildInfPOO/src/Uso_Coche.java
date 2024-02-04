import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println(miCoche.dime_datosgenerales());

        miCoche.establece_color(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(miCoche.dme_color());

        miCoche.configura_asientos(JOptionPane.showInputDialog("Quieres asientos de cuero?"));

        System.out.println(miCoche.dime_asientos());

        miCoche.setClimatizador(JOptionPane.showInputDialog("Quieres climatizador?"));

        System.out.println(miCoche.isClimatizador());

        System.out.println();

        System.out.println(miCoche.pesoCoche());

        System.out.println("El precio total es "+miCoche.precioCoche());


    }

}
