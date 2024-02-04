import java.util.Scanner;

public class rayatres {
    public static void main(String[] args) {
        char[][] tablero = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char jugadorActual = 'X';

        boolean juegoEnCurso = true;

        while (juegoEnCurso) {
            mostrarTablero(tablero);
            System.out.println("Turno del jugador " + jugadorActual);
            int fila = pedirCoordenada("Fila (1-3): ") - 1;
            int columna = pedirCoordenada("Columna (1-3): ") - 1;

            if (esCasillaValida(tablero, fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                if (hayGanador(tablero, jugadorActual)) {
                    mostrarTablero(tablero);
                    System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                    juegoEnCurso = false;
                } else if (esEmpate(tablero)) {
                    mostrarTablero(tablero);
                    System.out.println("¡Empate!");
                    juegoEnCurso = false;
                } else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Casilla no válida. Inténtalo de nuevo.");
            }
        }
    }

    private static void mostrarTablero(char[][] tablero) {
        System.out.println("  1 2 3");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }

    private static int pedirCoordenada(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Introduce un número válido.");
            System.out.print(mensaje);
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static boolean esCasillaValida(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[0].length && tablero[fila][columna] == ' ';
    }

    private static boolean hayGanador(char[][] tablero, char jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                    (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    private static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}