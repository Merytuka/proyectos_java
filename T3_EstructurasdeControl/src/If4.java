import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un año para saber si es bisiesto");
        int ano = teclado.nextInt();
        if(ano%4==0){
            System.out.println("El año "+ ano +" sí es bisisesto");
        } else{
            System.out.println("El año "+ ano +" no es bisisesto");
        }
    }
}
