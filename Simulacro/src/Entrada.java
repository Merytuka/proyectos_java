import java.util.Arrays;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Introduzca 5 números comprendidos entre el 1 y el 10");
        Scanner teclado = new Scanner(System.in);
        int numeros = teclado.nextInt();
        int[] numerosParticipante = new int[4];


        if(numeros > 0 && numeros < 10) {
            for (int i = 0; i >= 4; i++) {
                numerosParticipante[i] = numeros;
            }

            for (int i = 0; i < numerosParticipante.length; i++) {
                System.out.println(numerosParticipante[i]);
            }
        }
        else {
            System.out.println("el número introducido no es válido ya qu eno se encuentra entre 1  y 10");
        }










    }
}
