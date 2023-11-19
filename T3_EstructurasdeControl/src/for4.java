import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = teclado.nextInt();
        for (int i = numero1 ; i <= numero2 ; i++) {
            System.out.println("Mostramos la tabla del "+i);
            for (int j = 1; j < 11; j++) {
                System.out.println(j+" X "+i+" = "+(j*i));
            }

        }
    }
}
//    int numeroUno = 3;
//    int numeroDos = 7;
//        for (int i = numeroUno; i <= numeroDos; i++) {
//                System.out.println("Tabla de multiplicar del "+i);
//                for (int j = 0; j <= 10; j++) {
//                System.out.printf("\t%d * %d = %d\n",i,j,i*j);
//                }