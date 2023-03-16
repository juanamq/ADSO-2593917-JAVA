import java.util.Scanner;

public class Ejercicio21{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < n; i++) {
            arr1[i] = entrada.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < n; i++) {
            arr2[i] = entrada.nextInt();
        }

        int[] arr3 = new int[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr3[j++] = arr1[i];
            arr3[j++] = arr2[i];
        }

        System.out.print("Arreglo 1: ");
        printArray(arr1);
        System.out.print("Arreglo 2: ");
        printArray(arr2);
        System.out.print("Arreglo 3: ");
        printArray(arr3);

        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

       
    }


}