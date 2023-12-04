import java.util.Scanner;

public class for_notion_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce un número");

            numeros[i]=teclado.nextInt();

            total += numeros[i];
        }
        System.out.println("El total es "+total);

    }
}
