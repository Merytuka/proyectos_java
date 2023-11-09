import java.util.Scanner;

public class Switch6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona una opción");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Opcion 1 seleccionada");
                break;
            case 2:
                System.out.println("Opcion 2 seleccionada");
                break;
            case 3:
                System.out.println("Opcion 3 seleccionada");
                break;
            case 4:
                System.out.println("Opcion 4 seleccionada");
                break;
            default:
                System.out.println("La opción seleccionada no existe");
        }
    }
}
