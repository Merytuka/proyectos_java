import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números entre 1 y 100
        System.out.print("Ingrese el primer número (entre 1 y 100): ");
        int numero1 = scanner.nextInt();

        // Verificar que el primer número esté en el rango permitido
        while (numero1 < 1 || numero1 > 100) {
            System.out.println("Número fuera de rango. Inténtelo nuevamente.");
            System.out.print("Ingrese el primer número (entre 1 y 100): ");
            numero1 = scanner.nextInt();
        }

        System.out.print("Ingrese el segundo número (entre 1 y 100): ");
        int numero2 = scanner.nextInt();

        // Verificar que el segundo número esté en el rango permitido
        while (numero2 < 1 || numero2 > 100) {
            System.out.println("Número fuera de rango. Inténtelo nuevamente.");
            System.out.print("Ingrese el segundo número (entre 1 y 100): ");
            numero2 = scanner.nextInt();
        }

        // Cerrar el scanner después de obtener los números
        scanner.close();

        // Calcular el Mínimo Común Múltiplo (MCM) utilizando un bucle do-while
        int mcm = Math.max(numero1, numero2); // Inicializar con el valor máximo de los dos números

        do {
            if (mcm % numero1 == 0 && mcm % numero2 == 0) {
                // Si mcm es divisible por ambos números, hemos encontrado el MCM
                System.out.println("El Mínimo Común Múltiplo de " + numero1 + " y " + numero2 + " es: " + mcm);
                break;
            }

            // Incrementar mcm para la siguiente iteración
            mcm++;
        } while (true); // El bucle continuará hasta que se encuentre el MCM
    }
}
