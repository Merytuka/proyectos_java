//3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
//    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
//    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido

import java.util.Scanner;

public class Arrays3_Base {
    public static void main(String[] args) {

        System.out.println("introduce 10 números");
        int [] conjunto = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner teclado = new Scanner(System.in);
            int numero = teclado.nextInt();
            conjunto [i]= numero;
        }
        System.out.println("Vamos a mostrar el array en orden inverso");
        for (int i = 9; i >= 0 ; i--) {
            System.out.println("Este es el elemento "+i+" del array conjunto. Su valor es: "+conjunto[i]);
        }
        System.out.println("Vamos a mostrar el array en el orden original");
        for (int i = 0; i < conjunto.length; i++) {
            System.out.println("Este es el elemento "+i+" del array conjunto. Su valor es: "+conjunto[i]);
        }

    }
}
