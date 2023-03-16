import java.util.Scanner;

public class Ejercicio17{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el valor de N: ");
        int n = scanner.nextInt();

        
        int[] arreglo = new int[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }

        
        System.out.print("Arreglo Original: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("}");

        
        int[] pares = new int[n];
        int[] impares = new int[n];
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < n; i++) {
            if (arreglo[i] % 2 == 0) {
                pares[contadorPares] = arreglo[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = arreglo[i];
                contadorImpares++;
            }
        }

        
        System.out.print("Arreglo Pares: { ");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("} - Longitud: " + contadorPares);

        System.out.print("Arreglo Impares: { ");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println("} - Longitud: " + contadorImpares);

       
    }


}