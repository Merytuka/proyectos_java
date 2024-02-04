import java.util.Scanner;

public class ej02 {
    //Escribe un programa en Java que pida al usuario ingresar un número y utilice un método para determinar si ese
    // número es primo o no. Muestra el resultado en la consola.
    public static void main(String[] args) {
        System.out.println("Introduce un número para saber si es par.");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        if(primo(numero)==0){
            System.out.println("El número "+numero+" es PAR");
        }
        else {
            System.out.println(numero+" NO es PAR");
        }




    }
    public static int primo(int a){
        return a%2;

    }
}
