import java.util.Scanner;

public class T2_Ej4_MariaGonzalez {
    public static void main(String[] args) {
        int primerossegundos, segundos, minutos, horas, dias;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca número de segundos por favor: ");
        primerossegundos= teclado.nextInt();

        minutos = primerossegundos / 60;
        segundos = primerossegundos % 60;
        horas = minutos / 60;
        minutos = minutos % 60;
        dias = horas / 24;
        horas = horas % 24;
        System.out.println(primerossegundos+" segundos son: "+ dias + " Dias, "+horas+" Horas, "+minutos+" Minutos y "+segundos+" segundos.");


    }
}
