import java.util.Scanner;

public class While0 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce datos");
        String palabras = teclado.next();
        while (!palabras.equals("FIN")){

            System.out.println("repetimos "+palabras);
            System.out.println("introduce nueva palabra");
            palabras = teclado.next();
        }
        System.out.println("Bucle finalizado");
    }
}
