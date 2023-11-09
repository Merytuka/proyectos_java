import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número del mes");
        int mes = teclado.nextInt();
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tiene 31 días");
                break;
            case 2:
                System.out.println("Tiene 28 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tiene 30 días");
                break;
            default:
                System.out.println("El número introducido no corresponde a ningún mes");
        }
    }
}
