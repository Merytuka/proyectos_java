import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántas temperaturas vas a introducir?");
        int cantidadTemperaturas = teclado.nextInt();
        double mediaTemperatura=0;
        double sumaTemperaturas=0;
        for (int i = 0; i < cantidadTemperaturas; i++) {
            System.out.println("introduce temperatura");
            int temperatura = teclado.nextInt();
            if (temperatura<1){
                temperatura = 10;
            }
            sumaTemperaturas += temperatura;
        }
        System.out.println("La media de temperaturas es"+sumaTemperaturas/cantidadTemperaturas);
    }
}
