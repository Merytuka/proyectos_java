import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de 4 dígitos");
        int capicuo = teclado.nextInt();
        if(capicuo>=1000 && capicuo<=9999){
            int digito1 = capicuo/1000;
            int digito2 = (capicuo/100)%10;
            int digito3 = (capicuo/10)%10;
            int digito4 = capicuo%10;

//            System.out.println(digito1+"----"+digito2+"----"+digito3+"----"+digito4);
            if(digito1==digito4 && digito2==digito3){
                System.out.println("El número "+ capicuo +" es capicúo");
            }else{
                System.out.println("El número "+ capicuo +" no es capicúo");
            }
        }else{
            System.out.println("El número introducido no tiene 4 dígitos");
        }
   }
}
