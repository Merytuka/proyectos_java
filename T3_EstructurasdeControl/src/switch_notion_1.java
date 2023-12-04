import java.util.Scanner;

public class switch_notion_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número");
        int a = teclado.nextInt();

        switch (a){
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;
            case 4:
                System.out.println("Número 4");
                break;
            default:
                System.out.println("Número desconocido");
                break;
        }
    }
}
