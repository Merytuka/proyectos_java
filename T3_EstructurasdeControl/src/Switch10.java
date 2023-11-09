import java.util.Scanner;

public class Switch10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce código de producto");
        String codigo = teclado.next();
        switch (codigo) {
            case "111A":
                System.out.println("Carpeta = 1.20");
                break;
            case "222B":
                System.out.println("Cuaderno = 1,75");
            default:
                System.out.println("no existe el producto");
        }
    }
}
