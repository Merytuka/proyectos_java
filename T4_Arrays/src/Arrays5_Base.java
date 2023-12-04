import java.util.Scanner;

//Realiza un programa que pida 8 números enteros, los guarde en un array y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.
public class Arrays5_Base {
    public static void main(String[] args) {
        System.out.println("Introduce 8 números enteros");
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            Scanner teclado = new Scanner(System.in);
            int numero = teclado.nextInt();
            numeros[i] = numero;
        }
        System.out.println("Vamos a mostrar el resultado: ");

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0){
                System.out.println(numeros[i]+" -> Es Par");
            }else{
                System.out.println(numeros[i]+" -> Es Impar");
            }
        }
    }
}
