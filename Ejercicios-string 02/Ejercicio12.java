import java.util.Scanner;

public class Ejercicio12{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        
        System.out.print("Ingrese la longitud del arreglo: ");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];
        String rand = new String();
        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextLine(100);
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\nArreglo ordenado:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }

       
    }


}