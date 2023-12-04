import java.util.Arrays;
import java.util.Scanner;

//1. Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
//    - Ver todas las palabras: mostrarla todas las palabras del array
//    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
//    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
//    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
//    - Ver palabra con más letras
//    - Ver palabra con menos letras
public class Arrays7_Base {
    public static void main(String[] args) {
        System.out.println("Introduce 10 palabras");
        String[] palabras = new String[10];

        int letras = 0;
        double media = 0.0;
        for (int i = 0; i < palabras.length; i++) {
            Scanner teclado = new Scanner(System.in);
            palabras[i] = teclado.next();
        }

        System.out.println("Decide que quieres hacer: ");
        System.out.println("1.- Ver todas las palabras");
        System.out.println("2.- Obtener una palabra al azar");
        System.out.println("3.- Ver el número de letras totales");
        System.out.println("4.- Ver la media de letras");
        System.out.println("5.- Ver la palabra con más letras");
        System.out.println("6.- Ver la palabra con menos letras");

        Scanner teclado2 = new Scanner(System.in);
        int decision = teclado2.nextInt();

        switch (decision) {
            case 1:
                for (String item : palabras) {
                    System.out.print(item + " - ");
                }
                break;
            case 2:
                int azar = (int) (Math.random() * 10);
                System.out.println(palabras[azar]);
                break;
            case 3:
                for (int i = 0; i < palabras.length; i++) {
                    letras += palabras[i].length();
                }
                System.out.print(letras);
                break;
            case 4:
                for (int i = 0; i < palabras.length; i++) {
                    letras += palabras[i].length();
                    media = (double) letras / palabras.length;
                }
                System.out.println(media);
                break;
            case 5:
                String palabraLarga = palabras[0];
                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].length() > palabraLarga.length()) {
                        palabraLarga = palabras[i];
                    }
                }
                System.out.println(palabraLarga);
                break;
            case 6:
                String palabraCorta = palabras[0];
                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].length() < palabraCorta.length()) {
                        palabraCorta = palabras[i];
                    }
                }
                System.out.println(palabraCorta);
                break;

//            default:
//                for (String pal : palabras) {
//                    for (int i = 1; i < palabras.length; i++) {
//                        if (palabras[i].length() > palabras[i - 1].length()) {
//                            String moco = palabras[i];
//                            palabras[i] = palabras[i - 1];
//                            palabras[i - 1] = moco;
//                        }
//                    }
//                }
//                for (String pal : palabras) {
//                    System.out.println(pal + " = "+pal.length());
//                }
//
//                break;
            default:
                System.out.println("El número introducido no corresponde a ninguna opción");
                break;
        }

    }
}
