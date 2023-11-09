import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de tres cifras. Vamos a averigüar si es un número Amstrong");
        int numero = teclado.nextInt();
        if(numero>=100 && numero<=999){
            int digito1 = (numero/100)%10;
            int digito2 = (numero/10)%10;
            int digito3 = numero%10;
            //System.out.println(digito1+"--"+digito2+"--"+digito3+);
            int digito1elevado = (int) Math.pow(digito1,3);
            int digito2elevado = (int) Math.pow(digito2,3);
            int digito3elevado = (int) Math.pow(digito3,3);
            if(numero == digito1elevado + digito2elevado + digito3elevado){
                System.out.println("El número "+numero+" es un número Amstrong porque -->"+digito1+" elevado a 3 es "+digito1elevado+","+digito2+" elevado a 3 es "+digito2elevado+", y "+digito3+" elevado a 3 es "+digito3elevado+", y la suma de todos es "+digito1elevado+"+"+digito2elevado+"+"+digito3elevado+"="+numero);
            }else{
                System.out.println("El número "+numero+" no es un número Amstrong porque -->"+digito1+" elevado a 3 es "+digito1elevado+","+digito2+" elevado a 3 es "+digito2elevado+", y "+digito3+" elevado a 3 es "+digito3elevado+", y la suma de todos "+digito1elevado+"+"+digito2elevado+"+"+digito3elevado+"!="+numero);
            }

        }else{
            System.out.println("El número no tiene tres dígitos");
        }
    }

}
