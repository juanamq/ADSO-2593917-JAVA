import java.util.Scanner;

public class Ejercicio10{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingresa un número: ");
        int num = entrada.nextInt();

        int[] arreglo = new int[num];

        for (int i = 0, j = 1; i < arreglo.length; i++, j += 2) {
            arreglo[i] = j;
        }

        System.out.print("Arreglo de números impares: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

       
    }


}