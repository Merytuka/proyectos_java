import java.sql.SQLOutput;
import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la base");
        int base = teclado.nextInt();
        System.out.println("introduce el exponente");
        int exponente = teclado.nextInt();


        if (base == 0 && exponente == 0) {
            System.out.println("Error");
        } else {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println(resultado);
        }
    }
}
