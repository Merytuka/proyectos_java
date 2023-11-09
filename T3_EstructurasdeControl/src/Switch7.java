import java.util.Scanner;

public class Switch7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        int nota = teclado.nextInt();
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Has suspendido");
                break;
            case 5:
            case 6:
                System.out.println("Enhorabuena has aprobado");
                break;
            case 7:
            case 8:
                System.out.println("Has sacado un Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matrícula de Honor");
                break;
            default:
                System.out.println("La nota introducida no es válida");
        }
    }
}
