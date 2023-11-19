import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = teclado.nextInt();

        if (numero1%2==0){
            for (int i = numero1; i <= numero2; i+=2) {
                System.out.println(i);
            }
        }
        for (int j = numero1+1; j <= numero2 ; j+=2) {
            System.out.println(j);
        }
    }
}
