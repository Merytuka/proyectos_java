//Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
import java.util.Scanner;

public class Arrays1_Base {
    public static void main(String[] args) {
        int[] conjunto = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número" );

            Scanner teclado = new Scanner(System.in);
            int numero = teclado.nextInt();
            conjunto[i] = numero;


        }
        System.out.println("Hemos finalizado de introducir números");
        System.out.println("Su array es: ");
        for (int i = 0; i < conjunto.length; i++) {
            System.out.println("Elemento"+i+"->"+conjunto[i]);


        }



    }
}
