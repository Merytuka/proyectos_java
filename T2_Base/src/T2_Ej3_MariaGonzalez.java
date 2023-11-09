import java.util.Scanner;

public class T2_Ej3_MariaGonzalez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la Variable 1: ");
        float var1 = teclado.nextFloat();
        System.out.println("Introduzca la Variable 2: ");
        float var2 = teclado.nextFloat();

        System.out.println("La SUMA de ambas es: "+(var1+var2));
        System.out.println("La RESTA de ambas es: "+(var1-var2));
        System.out.println("La MULTIPLICACION de ambas es: "+(var1*var2));
        System.out.println("La DIVISION de ambas es: "+(var1/var2));
        System.out.println("El RESTO ENTERO de ambas es: "+(var1%var2));
    }
}
