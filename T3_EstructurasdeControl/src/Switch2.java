import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un carácter");
        char caracter = teclado.next().charAt(0);
        switch (String.valueOf(caracter).toUpperCase().charAt(0)) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'e':
                System.out.println("Es Vocal");
                break;
            default:
                System.out.println("Es consonante");
        }

    }
}
