

public class While3 {
    public static void main(String[] args) {
        int numrandom ;
        int max =0;
        do{
            numrandom = (int) (Math.random()*101);
            System.out.println(numrandom);
            if(numrandom>max){
                max = numrandom;
            }
        }while (numrandom!=0);
        System.out.println("El máximo generado es "+max);

    }
}
