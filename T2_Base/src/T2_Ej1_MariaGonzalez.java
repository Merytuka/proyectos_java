import java.util.Scanner;

public class T2_Ej1_MariaGonzalez {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca nombre y apellidos");
        final String NOMBRE = teclado.nextLine();

        System.out.println("Introduzca su calle");
        final String CALLE = teclado.nextLine();

        System.out.println("Introduzca su portal");
        final String PORTAL = teclado.nextLine();

        System.out.println("Introduzca su piso");
        final String PISO = teclado.nextLine();

        System.out.println("Introduzca su código postal");
        final String CP = teclado.nextLine();

        System.out.println("Introduzca su localidad");
        final String LOCALIDAD = teclado.nextLine();

        System.out.println("Introduzca su provincia");
        final String PROVINCIA = teclado.nextLine();

        System.out.println("Introduzca su pais");
        final String PAIS = teclado.nextLine();

        System.out.println(NOMBRE+"\nC/: "+CALLE+" Nº: "+ PORTAL+", Piso: "+ PISO+"\n"+CP +" "+ LOCALIDAD +" - "+PROVINCIA+"\n"+PAIS);

    }
}
