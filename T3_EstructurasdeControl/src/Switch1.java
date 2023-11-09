import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        int diasemana = teclado.nextInt();
         switch (diasemana) {
             case 1:
                 System.out.println("El día 1 es Lunes");
                 break;
             case 2:
                 System.out.println("El día 2 es Martes");
                 break;
             case 3:
                 System.out.println("El día 3 es Miércoles");
                 break;
             case 4:
                 System.out.println("El día 4 es Jueves");
                 break;
             case 5:
                 System.out.println("El día 5 es Viernes");
                 break;
             case 6:
                 System.out.println("El día 6 es Sábado");
                 break;
             case 7:
                 System.out.println("El día 7 es Domingo");
                 break;
         }
    }
}
