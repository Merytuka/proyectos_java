import java.util.Scanner;

public class T2_Ej2_MariaGonzalez {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera variable: ");
        int numero1= scanner.nextInt();
        System.out.println("Introduce la segunda variable: ");
        int numero2= scanner.nextInt();
        System.out.println("Introduce la tercera variable: ");
        int numero3= scanner.nextInt();
        System.out.println("Introduce la cuarta variable: ");
        int numero4= scanner.nextInt();
        System.out.println("Introduce la quinta variable: ");
        int numero5= scanner.nextInt();

        System.out.println("Sus datos ordenadoss son: "+numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);

        int aux=numero1;
        numero1=numero2;
        numero2=numero3;
        numero3=numero4;
        numero4=numero5;
        numero5=aux;

        System.out.println("Sus datos desordenadoss son: "+numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);

        aux=numero5;
        numero5=numero4;
        numero4=numero3;
        numero3=numero2;
        numero2=numero1;
        numero1=aux;

        System.out.println("Sus datos reordenadoss son: "+numero1+" "+numero2+" "+numero3+" "+numero4+" "+numero5);
    }
}
