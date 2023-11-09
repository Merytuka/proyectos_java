import java.util.Scanner;

public class Switch9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de mes");
        int estacion = teclado.nextInt();
        switch (estacion){
            case 3:
            case 4:
            case 5:
                System.out.println("Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Otoño");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("El número no corresponde a ningún mes");


        }
    }
}
