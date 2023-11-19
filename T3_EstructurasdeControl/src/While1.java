import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.println("Introduce número");
            numero = teclado.nextInt();
            if (numero>0){
                suma =  suma + numero;
            }
        } while (numero!=0);
            System.out.println("La suma es"+suma);

    }
}
