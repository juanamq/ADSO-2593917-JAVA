import java.util.Scanner;

public class Ejercicio11{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        int n = 10; 
        int[] arreglo = new int[n];
        int indice = 0; 

        
        for (int i = 2; indice < n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                arreglo[indice] = i;
                indice++;
            }
        }
        System.out.println(arreglo);

       
    }


}