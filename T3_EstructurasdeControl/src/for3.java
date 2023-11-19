import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número para ver su tabla de multiplicar");
        int numeroTabla = teclado.nextInt();
        System.out.println("Mostramos la tabla del "+numeroTabla);
            for (int i = 1; i < 11; i++) {
                System.out.println(i + " X " + numeroTabla + " = " + (i * numeroTabla));
            }
    }
}
