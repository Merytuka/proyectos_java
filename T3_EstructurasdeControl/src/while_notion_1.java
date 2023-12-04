
import java.util.Scanner;

public class while_notion_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contadorPositivos = 0;

        System.out.println("Introduce enteros pares. Cuando introduzcas un impar, se mostrará el número de positivos.");

        do {
            System.out.print("Introduce un entero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                // Verificar si es positivo
                if (numero > 0) {
                    contadorPositivos++;
                }
            } else {
                // Si se introduce un número impar, mostrar el contador de positivos
                System.out.println("Se ha introducido un número impar.");
                System.out.println("Número de positivos introducidos: " + contadorPositivos);
            }

        } while (numero % 2 == 0); // Continuar mientras se introduzcan números pares

        scanner.close();
    }
}