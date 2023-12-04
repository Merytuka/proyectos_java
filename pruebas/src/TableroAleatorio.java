import java.util.Scanner;
import java.util.Random;

public class TableroAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();


        int[][] tablero = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = new Random().nextInt(50,100); // Rango de números aleatorios
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.print("Ingrese un número para buscar en el tablero: ");
        int numeroABuscar = scanner.nextInt();


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] == numeroABuscar) {
                    System.out.println("El número " + numeroABuscar + " está en el tablero.");

                    return;
                }
            }
        }


        System.out.println("El número " + numeroABuscar + " no está en el tablero.");
        scanner.close();
    }
}