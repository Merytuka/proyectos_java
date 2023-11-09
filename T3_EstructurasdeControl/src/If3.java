import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int var = teclado.nextInt();
        if (var % 20 == 0) {
            if (var >= -100 && var <= 100) {
                System.out.println("Es múltiplo de 20 y está entre -100 y 100.");
            } else {
                System.out.println("Es múltiplo de 20 y no está entre -100 y 100.");
            }
        } else {
            if (var >= -100 && var <= 100) {
                System.out.println("No es múltiplo de 20 y está entre -100 y 100.");
            } else {
                System.out.println("No es múltiplo de 20 y no está entre -100 y 100.");
            }
        }
    }
}