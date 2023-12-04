//2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
//    - modificar todos los 6 por 8
//    - modificar todos los 7 por 15
//    - modificar todos los 20 por 10
//Al finalizar el programa deberá indicar cuántas modificaciones se han realizado.

public class Arrays6_Base {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        System.out.println("Este es el array original: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int) (Math.random()*29+1);

            System.out.print(numeros[i]+" - ");
        }
        System.out.println();
        System.out.println("Vamos a cambiar algunos números");
        int modificaciones = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==6){
                numeros[i]=8;
                modificaciones++;
            } else if (numeros[i]==7) {
                numeros[i]=15;
                modificaciones++;
            } else if (numeros[i]==20) {
                numeros[i]=10;
                modificaciones++;
            }
            System.out.print(numeros[i]+" - ");
        }
        System.out.println();
        System.out.println("Modificaciones: "+modificaciones);

    }
}
