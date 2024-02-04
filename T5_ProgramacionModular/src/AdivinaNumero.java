import java.util.Scanner;

public class AdivinaNumero {


    public static void main(String[] args) {
        int numero = (int) (Math.random() * 99) + 1;
        int apuesta;
        boolean heAcertado=false;
        int limiteInferior = 1;
        int limiteSuperior = 100;
        System.out.println("El número a adivinar está entre 1 y 100");

        do {

            System.out.println("¿Cuál es tu número?");
            Scanner teclado = new Scanner(System.in);
            apuesta = teclado.nextInt();
            if (!compruebaRango(apuesta)) {
                System.out.println("La apuesta está fuera de rango");
            } else {

                heAcertado = adivinaNumero(apuesta, numero);
                if (!heAcertado) {
                    if (esMayor(apuesta, numero)) {
                        limiteSuperior = apuesta - 1;
                        System.out.println("El número es menor, se encuentra entre " + limiteInferior + " y " + limiteSuperior);
                    } else {
                        limiteInferior = apuesta + 1;
                        System.out.println("El número es mayor, se encuentra entre " + limiteInferior + " y " + limiteSuperior);
                    }

                    if (!compruebaRango(apuesta)) {
                        System.out.println("La apuesta está fuera de rango");
                    }


                } else {
                    System.out.println("Enhorabuena has acertado");

                }
            }
        }
        while (!heAcertado);
    }


    public static boolean adivinaNumero(int a, int n) {
        return a == n;
    }

    public static boolean esMayor(int a, int n) {
        return a > n;
    }

    public static boolean compruebaRango(int a) {
        if (a > 0 && a < 101) {
            return true;
        }
        return false;
    }


//    public static boolean esMenor(int a, int n) {
//        return a<n;
//    }
}

