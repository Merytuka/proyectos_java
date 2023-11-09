import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número entero");
        int numero = teclado.nextInt();
        switch (numero%2){
            case 0:
                System.out.println("Es par");
                break;
            default:
                System.out.println("Es impar");
        }
    }
}
