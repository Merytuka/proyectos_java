//2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array. Una vez metidos, se deberá mostrar:
//    - Numero de puntos obtenidos
//    - Media de puntos obtenidos

public class Arrays2_Base {
    public static void main(String[] args) {
        int [] conjunto = new int[30];
        for (int i = 0; i < 30; i++) {
            int numero = (int) (Math.random()*9);
            conjunto[i]=numero;

        }
        System.out.println("Este es el carton generado: ");
        for (int item: conjunto) {
            System.out.print(item+" - ");
        }
        System.out.println();
        double media =0.0;
        int total = 0;
        for (int i = 0; i < 30; i++) {
            total += conjunto [i];
            media = (double) total / 30;
        }
        System.out.print("El total es: "+total);
        System.out.println();
        System.out.print("La media es: "+ media);



    }
}
