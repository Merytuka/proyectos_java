import java.util.Scanner;

public class Ejercicio3Metodos {
    static int[] numeros = new int [10];
    public static void main(String[] args) {
        System.out.println("Ejercicio 3 Métodos");
        rellenarArray();
        mostrarArray();

        mostrarInverso();


    }
    //Rellenear Array
    public static void rellenarArray(){

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Indica numero");
            int numero = teclado.nextInt();
            numeros[i]= numero;

        }

    }

    //Mostrar Array

    public static void mostrarArray(){
        for (int numero : numeros) {
            System.out.print(numero+" - ");
        }
        System.out.println();
    }

    //Mostrar inverso

    public static void mostrarInverso(){
        for (int i = numeros.length-1; i >= 0 ; i--) {
            System.out.print(numeros[i]+" - ");
        }
        System.out.println();
    }

}
