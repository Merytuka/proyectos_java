import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a comparar dos números enteros");
        System.out.println("Introduce el primer número");
        int va1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int va2 = teclado.nextInt();

        if(va1>va2){
            System.out.println("El primer número es mayor");
        } else if (va1<va2) {
            System.out.println("El segundo número es mayor");
        } else{
            System.out.println("Ambos son iguales");
        }

    }
    }

