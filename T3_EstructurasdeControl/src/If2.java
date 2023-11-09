import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int var1  = teclado.nextInt();
        System.out.println("Introduce otro número entero");
        int var2  = teclado.nextInt();
        System.out.println("Introduce otro número entero");
        int var3  = teclado.nextInt();

        if(var1+var2==var3){
            System.out.println("el tercero es la suma del primero y el segundo");
            System.out.println(var1+"+"+var2+"="+var3);
        } else if (var1+var3==var2) {
            System.out.println("el segundo es la suma del primero y el tercero");
            System.out.println(var1+"+"+var3+"="+var2);
        } else if (var2+var3==var1) {
            System.out.println("el primero es la suma del segundo y el tercero");
            System.out.println(var2+"+"+var3+"="+var1);
        } else {
            System.out.println("ninguno es la suma de los otros dos");
        }
    }
}
