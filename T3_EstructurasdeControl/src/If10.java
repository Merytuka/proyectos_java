import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número");
        int numero = teclado.nextInt();
        if(numero%2==0){
            numero = numero+1;
            System.out.println(numero);
        }else{
            numero = numero - 1;
            System.out.println(numero);
        }
    }
}
