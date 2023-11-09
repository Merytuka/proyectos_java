import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introuzca un número entero");
        int numero1 = teclado.nextInt();
        System.out.println("Introuzca un segundo número entero");
        int numero2 = teclado.nextInt();
        System.out.println("Introuzca un tercer número entero");
        int numero3 = teclado.nextInt();

        if((numero1+1==numero2 && numero2+1==numero3)||(numero1-1==numero2 && numero2-1==numero3)){
            System.out.println("Los números con consecutivos");
        }else{
            System.out.println("Los números no son consecutivos");
        }


    }
}
