import java.util.Scanner;

public class Ejercicio22{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada .nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = sc.nextInt();
        }
        System.out.print("Ingrese la posición a buscar: ");
        int posicion = entrada .nextInt();
        int valor = arreglo[(posicion % n + n) % n]; 
        System.out.println("El valor para la posición " + posicion + " es: " + valor);

       
    }


}