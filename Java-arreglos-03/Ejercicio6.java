import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];
        int esPrimo= 0;

        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("Arreglo Original: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("}");

        int contadorPrimos = 0, contadorNoPrimos = 0;
        for (int i = 0; i < n; i++) {
            if (esPrimo == arreglo[i]) {
                contadorPrimos++;
            } else {
                contadorNoPrimos++;
            }
        }
        int[] arregloPrimos = new int[contadorPrimos];
        int[] arregloNoPrimos = new int[contadorNoPrimos];
        int indicePrimos = 0, indiceNoPrimos = 0;
        for (int i = 0; i < n; i++) {
            if (esPrimo == arreglo[i]) {
                arregloPrimos[indicePrimos] = arreglo[i];
                indicePrimos++;
            } else {
                arregloNoPrimos[indiceNoPrimos] = arreglo[i];
                indiceNoPrimos++;
            }
        }

        System.out.print("Arreglo Primos: { ");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(arregloPrimos[i] + " ");
        }
        System.out.println("}");
        System.out.print("Arreglo No Primos: { ");
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.print(arregloNoPrimos[i] + " ");
        }
        System.out.println("}");
        System.out.println("Longitud Arreglo Original: " + n);
        System.out.println("Longitud Arreglo Primos: " + contadorPrimos);
        System.out.println("Longitud Arreglo No Primos: " + contadorNoPrimos);
    }

    
}