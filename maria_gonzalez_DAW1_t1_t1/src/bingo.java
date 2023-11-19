import java.util.Locale;
import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {
        String reintento;
       do {
           int linea=0;
           int contadorGenerados = 0;
           int aciertosCarton = 0;
           int[] cartonGenerado = generarAleatoriosNoRepetidos(10);

           System.out.println("Este es tu cartón de Bingo. Buena suerte");
           for (int item : cartonGenerado) {
               System.out.print(item + " - ");
           }

           System.out.println("\n¿Cual es tu apuesta?");
           Scanner teclado = new Scanner(System.in);
           int apuesta = teclado.nextInt();

           System.out.println("¿En cuántos intentos crees que se acertará Bingo?");
           int intentos = teclado.nextInt();

           int[] numeroSalidos = new int[99];
           int numero;
           while (aciertosCarton < 10) {
               do {
                   numero = (int) (Math.random() * 99) + 1;
               } while (repetido(numero, numeroSalidos));
               System.out.print(numero + " ");
               contadorGenerados++;
               numeroSalidos[contadorGenerados - 1] = numero;

               if (repetido(numero, cartonGenerado)) {
                   aciertosCarton++;
                   if(aciertosCarton==5){
                       linea = contadorGenerados;
                   }
               }
           }



           System.out.println("\nHan salido " + contadorGenerados + " números hasta completar tu Bingo");
           System.out.println("Se ha cantado linea en "+linea+" intentos.");
           if (intentos == contadorGenerados) {
               System.out.println("Enhorabuena has ganado! tu premio es" + apuesta * 10 + " €");
           }else {
               System.out.println("Lo sentimos no has cantado Bingo ");
           }

           System.out.println("Quieres volver a intentarlo? Y/N");
             reintento = teclado.next();
       }while (reintento.toUpperCase(Locale.US).equals("Y"));


    }

    private static int[] generarAleatoriosNoRepetidos(int arraySize) {
        int[] carton = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            int aleatorioGenerado;
            do {
                aleatorioGenerado = (int) (Math.random() * 99) + 1;

            } while (repetido(aleatorioGenerado, carton));
            carton[i] = aleatorioGenerado;
        }

        return carton;
    }

    private static boolean repetido(int numGenerado, int[] numerosSalidos) {
        for (int item : numerosSalidos) {
            if (item == numGenerado) {
                return true;
            }
        }
        return false;
    }


}
