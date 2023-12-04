import java.util.Arrays;

public class estudio {
    public static void main(String[] args) {
       int [] numeros = {8,4,2,56,23,15,17,44,96,105};
        System.out.println(numeros.length);
        numeros[4]=1000;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("la posición "+i+" del array números corresponde al dato "+numeros[i]);

        }
        System.out.println("tu nuevo array es este: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int) (Math.random()*98+1);
            System.out.print(numeros[i]+" - ");



        }
        System.out.println();
        int[] numerosNuevos ={8,4,6,2};
        for (int item : numerosNuevos) {
            System.out.println(item);
        }

        Arrays.sort(numerosNuevos);
        System.out.println("Ordenado "+Arrays.toString(numerosNuevos));

        int [][] t1 = {{1,2,3},{4,5,6}};
        System.out.println(t1[1][1]);

        t1[0][0]=15;

        for (int i = 0; i < t1.length; i++) {
            System.out.printf("Array numero %d",i);
            System.out.println();
            for (int j = 0; j < t1[i].length; j++) {
                System.out.printf("Elemento del array %d",t1[i][j]);
                System.out.println();


            }

        }

        System.out.println("longitud del array: "+t1.length);

        for ( int [] numerosUno : t1 ) {
            System.out.println("el array es: "+numerosUno.toString());
            for ( int numerosDos : numerosUno) {
                System.out.println("El valor es: "+ numerosDos);

            }
        }

        String[][] multidimensional = {{"primera","posición"},{"segunda","posición"},{"tercera","posición"}}; int i = 0;
        for (String[] temp : multidimensional){
            System.out.println("El array que se está evaluando es: "+temp.toString());
            for (String tempDos: temp){
                System.out.println("El valor es: "+tempDos);
            }
        }


    }



}
