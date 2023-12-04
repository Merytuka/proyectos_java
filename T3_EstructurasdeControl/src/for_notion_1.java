import java.util.Scanner;

public class for_notion_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número");
        int numero = teclado.nextInt();
        if (numero > 0 && numero < 11) {
            for (int i = 1; i < 11; i++) {

                System.out.println(numero + " por " + i + " = " + numero * i);

            }
        } else {
            System.out.println("Número erróneo");
        }
    }
}
