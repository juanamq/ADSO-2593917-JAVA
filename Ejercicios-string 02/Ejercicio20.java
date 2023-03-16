import java.util.Scanner;

public class Ejercicio20{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese la longitud de los arreglos: ");
        int n = entrada.nextInt();

        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[n];

        System.out.println("Ingrese los valores del primer arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo1[i] = entrada.nextInt();
        }

        System.out.println("Ingrese los valores del segundo arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo2[i] = entrada.nextInt();
        }

        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        String strArreglo1 = Arrays.toString(arreglo1);
        String strArreglo2 = Arrays.toString(arreglo2);

        if (strArreglo1.equals(strArreglo2)) {
            System.out.println("Los arreglos son equivalentes.");
        } else {
            System.out.println("Los arreglos no son equivalentes.");
        }

       
    }


}