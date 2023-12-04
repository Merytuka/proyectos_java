import java.util.Scanner;

public class if_notion_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número");
        int a = teclado.nextInt();
        String s;

        if (a % 2 == 0) {
            s = "Es par";
        } else{
            s = "Es impar";
        }
        System.out.println(s);


    }
}
