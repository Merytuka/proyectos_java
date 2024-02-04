import java.sql.SQLOutput;
import java.util.Scanner;

public class ej01 {
    //Crea un programa en Java que solicite al usuario dos números enteros, los sume utilizando un método y luego muestre el resultado.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quieres sumar? Y/N");
        String respuesta = teclado.next();

        while (respuesta.equals("Y")){



            System.out.println("Introduce un numero");
            int numero1 = teclado.nextInt();

            System.out.println("introduce un segundo numero");
            int numero2 = teclado.nextInt();


            System.out.println("La suma de ambos es");
            System.out.println(suma(numero1, numero2));

            System.out.println("Quieres sumar? Y/N");
            respuesta = teclado.next();

        }

        System.out.println("Ha finalizado la suma");


    }
    public static int suma (int a, int b){
        return a+b;
    }

}
