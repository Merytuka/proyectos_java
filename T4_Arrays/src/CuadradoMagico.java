import java.util.Scanner;

//Realizar una aplicación que permita crear un cuadrado mágico. Para ello nada más arrancar la aplicación pedirá
// el tamaño del cuadrado (3x3, 4x4, etc...)
//
//Una vez echo esto se mostrará por consola el cuadrado generado
//
//* Para que un cuadrado sea mágico, todas cada una delas filas, columnas y diagonales es la misma
public class CuadradoMagico {
    public static void main(String[] args) {
        System.out.println("Introduzca el tamaño del cuadrado que desea generar");
        Scanner teclado = new Scanner(System.in);
        int tamano = teclado.nextInt();

        int[][] cuadrado = new int[tamano][tamano];
        int[] numerosNoRepetidos = new int[tamano*tamano];
        int [] aleatorios = new int[tamano*tamano];

        for (int i = 0; i < tamano; i++) {

            System.out.println();

            for (int j = 0; j < tamano; j++) {
                //cuadrado[i][j] = (int)(Math.random()*(tamano*tamano)+1);
                aleatorios [] = 


                System.out.print(cuadrado[i][j]+"\t");

            }
        }
    }

}
