import java.util.Scanner;

public class Ejercicio3MetodosParametros {

    public static void main(String[] args) {
        System.out.println("Ejercicio 3 Métodos");
        int numeros [] = rellenarArray();
        mostrarArray(numeros);

        mostrarInverso(numeros);


    }
    //Rellenear Array
    public static int[] rellenarArray(){
        int numeros [] = new int[10];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Indica numero");
            int numero = teclado.nextInt();
            numeros[i]= numero;

        }

        return numeros;

    }

    //Mostrar Array

    public static void mostrarArray(int [] array){
        for (int numero : array) {
            System.out.print(numero+" - ");
        }
        System.out.println();
    }

    //Mostrar inverso

    public static void mostrarInverso(int [] array){
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]+" - ");
        }
    }

}
