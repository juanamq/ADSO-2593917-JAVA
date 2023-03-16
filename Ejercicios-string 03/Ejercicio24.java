import java.util.Scanner;

public class Ejercicio24{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();

        String[] arreglo = new String[n];
        System.out.println("Ingrese los valores para llenar el arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.next();
        }

        
        System.out.print("Ingrese la posición a eliminar: ");
        int posicion = entrada.nextInt();

        
        String[] nuevoArreglo = new String[n-1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != posicion) {
                nuevoArreglo[j] = arreglo[i];
                j++;
            }
        }

        
        System.out.println("Arreglo resultante:");
        for (int i = 0; i < n-1; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }

       
    }


}