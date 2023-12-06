import java.util.Scanner;

//Realizar una aplicación que simule el funcionamiento de 3 en raya. Para ello el sistema generará un tablero de 3x3 e
// irá pidiendo a los usuarios en que posición quieren colocar sus fichas.
//
//Ganará aquel jugador que tenga en la misma fila, columna o diagonal todas sus fichas colocadas
//
//En el caso de que los dos jugadores coloquen todas las fichas y no haya ganador, el sistema indicará que ha habido
// empate y si se quiere volver a empezar
public class Tresenraya {
    public static void main(String[] args) {
        int jugadas = 0;
        Scanner teclado = new Scanner(System.in);
        //generar tablero
        String[][] tablero = new String[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.println();

            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "[   ]";
                System.out.printf(tablero[i][j]);

            }

        }
        do {
            System.out.println();
            System.out.println("Jugador 1 Introduce tu tirada");
            System.out.print("Fila: ");
            int posicioni1 = teclado.nextInt();
            System.out.println();
            System.out.print("Columna: ");
            int posicionj1 = teclado.nextInt();
            if (posicioni1 >= 0 && posicioni1 < 3 && posicionj1 >= 0 && posicionj1 < 3 && tablero[posicioni1][posicionj1].equals("[   ]")) {
                tablero[posicioni1][posicionj1] = (jugadas % 2 == 0) ? "[ X ]" : "[ O ]";
//            tablero[posicioni1][posicionj1] = "[ X ]";
                for (int i = 0; i < 3; i++) {
                    System.out.println();

                    for (int j = 0; j < 3; j++) {

                        System.out.printf(tablero[i][j]);


                    }

                }
                if  (verificarTresEnRaya(tablero)){
                    System.out.println();
                    System.out.println("Tres en raya gana jugador 1");
                    return;
                }
            }else{
                    System.out.println("Posicion inválida");
                jugadas--;
                }

                jugadas++;
                System.out.println(jugadas);

                System.out.println();
                System.out.println("Jugador 2 Introduce tu tirada");
                System.out.print("Fila: ");
                int posicioni2 = teclado.nextInt();
                System.out.println();
                System.out.print("Columna: ");
                int posicionj2 = teclado.nextInt();
            if (posicioni2 >= 0 && posicioni2 < 3 && posicionj2 >= 0 && posicionj2 < 3 && tablero[posicioni2][posicionj2].equals("[   ]")) {
                tablero[posicioni2][posicionj2] = (jugadas % 2 == 0) ? "[ X ]" : "[ O ]";
                for (int i = 0; i < 3; i++) {
                    System.out.println();
                    for (int j = 0; j < 3; j++) {
                        System.out.printf(tablero[i][j]);
                    }

                }
                if  (verificarTresEnRaya(tablero)){
                    System.out.println();
                    System.out.println("Tres en raya gana jugador 2");
                    return;
                }
            }else{
                System.out.println("Posicion inválida");
                jugadas--;
            }
                jugadas++;
                System.out.println(jugadas);
            }
            while (jugadas < 9) ;
            System.out.println("Tablas");


        }
    private static boolean verificarTresEnRaya(String[][] tablero) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0].equals(tablero[i][1]) && tablero[i][1].equals(tablero[i][2]) && !tablero[i][0].equals("[   ]")) ||
                    (tablero[0][i].equals(tablero[1][i]) && tablero[1][i].equals(tablero[2][i]) && !tablero[0][i].equals("[   ]"))) {
                return true;
            }
        }

        // Verificar diagonales
        if ((tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2]) && !tablero[0][0].equals("[   ]")) ||
                (tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][0]) && !tablero[0][2].equals("[   ]"))) {
            return true;
        }

        return false;
    }
    }

