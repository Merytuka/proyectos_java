import java.util.Scanner;

public class iif_notion_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int a = teclado.nextInt();
        if (a < 0){
            System.out.println("negativo");

            if (a < 10){
                System.out.println("un dígito");
            }
        } else if(a < 99){
            System.out.println("dos dígitos");
        } else if (a > 99) {
            System.out.println("tres dígitos");
        }
    }
}
