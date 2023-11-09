import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero entero entre -100 y 100, no puede ser 0");
        float numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero entero entre -100 y 100, no puede ser 0");
        float numero2 = teclado.nextInt();
        System.out.println("Introduce el primer tercer entero entre -100 y 100, no puede ser 0");
        float numero3 = teclado.nextInt();

        if(numero1>=-100 && numero1<=100 && numero1!=0){
            if(numero2>=-100 && numero2<=100 && numero2!=0){
                if(numero3>=-100 && numero3<=100 && numero3!=0){
                    float inverso1 = 1/numero1;
                    float inverso2 = 1/numero2;
                    float inverso3 = 1/numero3;
                    System.out.println("La suma de sus inversos es: "+(inverso1+inverso2+inverso3));
                }else if(numero3==0){
                    float inverso1 = 1/numero1;
                    float inverso2 = 1/numero2;

                    System.out.println("El tercer número es igual a 0, no se utiliza.La suma de los inversos es del primero y el segundo es: "+(inverso1+inverso2));
                }
            }else if(numero2==0){
                float inverso1 = 1/numero1;
                float inverso3 = 1/numero3;
                System.out.println("El segundo número es igual a 0, no se utiliza.La suma de sus inversos es: "+(inverso1+inverso3));
            }
        }else if(numero1==0){
            float inverso2 = 1/numero2;
            float inverso3 = 1/numero3;
            System.out.println("El primer número es igual a 0, no se utiliza.La suma de sus inversos es: "+(inverso2+inverso3));
        }else{
            System.out.println("Alguno de los números no está dentro del rango. No se puede realizar la operacion");
        }
    }
}

