import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúantas veces vas a tirar el dado?");
        int lanzamientos = teclado.nextInt();
        if (lanzamientos<1){
            lanzamientos=100;

        }
            for (int i = 1; i <= lanzamientos; i++) {
                int resultado;
                resultado = (int) (Math.random()*6)+1;
                System.out.println("El resutado del lanzamiento "+i+" es: "+resultado);
            }
        }
    }

