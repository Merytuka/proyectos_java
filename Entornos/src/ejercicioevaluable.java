import java.util.Random;
import java.util.Scanner;

public class ejercicioevaluable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Obtener dimensiones del tablero del usuario
        System.out.print("Ingrese el número de filas: ");
        int nFilas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int nColumnas = scanner.nextInt();

        // Crear el tablero y llenarlo con números aleatorios
        int[][] tablero = new int[nFilas][nColumnas];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                tablero[i][j] = random.nextInt(100); // Números aleatorios hasta 99, puedes ajustar según sea necesario
            }
        }

        // Imprimir el tablero
        System.out.println("Tablero:");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println();
        }

        // Obtener el número a buscar del usuario
        System.out.print("Ingrese el número a buscar: ");
        int numeroABuscar = scanner.nextInt();

        // Buscar el número en el tablero
        boolean encontrado = false;
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                if (tablero[i][j] == numeroABuscar) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        // Imprimir el resultado
        if (encontrado) {
            System.out.println("¡El número " + numeroABuscar + " se encuentra en el tablero!");
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el tablero.");
        }
    }
}
