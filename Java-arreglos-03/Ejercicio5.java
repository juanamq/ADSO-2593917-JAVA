import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
       
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];
        
        
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i+1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        
        System.out.print("Ingrese el número de movimientos: ");
        int m = entrada.nextInt();
        
        
        for (int i = 1; i <= m; i++) {
            
            int temp = arreglo[0];
            
            
            for (int j = 0; j < n-1; j++) {
                arreglo[j] = arreglo[j+1];
            }
            
            
            arreglo[n-1] = temp;
            
            
            System.out.print("Movimiento " + i + ": { ");
            for (int j = 0; j < n; j++) {
                System.out.print(arreglo[j] + " ");
            }
            System.out.println("}");
        }

    }
}