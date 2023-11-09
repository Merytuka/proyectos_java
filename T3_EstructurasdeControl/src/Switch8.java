import java.util.Scanner;

public class Switch8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = teclado.nextInt();
        System.out.println("Introduce qué operación quieres hacer con ellos");
        char operacion = teclado.next().charAt(0);
        float resultado= (float) 0;
        switch (operacion){
            case '+':
                resultado = numero1 + numero2;
                System.out.println("El resultado es: "+numero1+"+"+numero2+"="+resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("El resultado es: "+numero1+"-"+numero2+"="+resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("El resultado es: "+numero1+"*"+numero2+"="+resultado);
                break;
            case '/':
                resultado = (float) numero1 / numero2;
                System.out.println("El resultado es: "+numero1+"/"+numero2+"="+resultado);
                break;
            default:
                System.out.println("La operación no es válida");
        }
    }
}
