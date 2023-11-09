import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el primer número");
        int numero1 = teclado.nextInt();
        System.out.println("introduce el segundo número");
        int numero2 = teclado.nextInt();
        System.out.println("introduce el tercer número");
        int numero3 = teclado.nextInt();

        if(numero1>=numero2 && numero2>=numero3){
            System.out.println(numero1+"->"+numero2+"->"+numero3);
        }else if (numero2>=numero3 && numero3>=numero1){
            System.out.println(numero2+"->"+numero3+"->"+numero1);
        }else if(numero3>=numero2 && numero2>=numero1){
            System.out.println(numero3+"->"+numero2+"->"+numero1);
        }else if(numero2>=numero1 && numero1>=numero3){
            System.out.println(numero2+"->"+numero1+"->"+numero3);
        } else if (numero3>=numero1 && numero1>=numero2) {
            System.out.println(numero3+"->"+numero1+"->"+numero2);
        }
    }
}
