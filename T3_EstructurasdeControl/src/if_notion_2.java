import java.util.Scanner;

public class if_notion_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número");
        int a = teclado.nextInt();

        if (a % 2 == 0){
            a++;
        } else if (a < 10) {
            a--;
        } else if (a < 100) {
            a=2*a+1;
        }else {
            a = 0;
        }
        System.out.println(a);
    }
}
