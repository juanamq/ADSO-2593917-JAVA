import java.util.Scanner;

public class Ejercicio18{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        
        int[] arreglo = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(100) + 1;
        }
        
        System.out.print("Arreglo original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        
        primos = new Array();
        noPrimos = new Array();
        for (int i = 0; i < n; i++) {
            if (esPrimo(arreglo[i])) {
                primos.add(arreglo[i]);
            } else {
                noPrimos.add(arreglo[i]);
            }
        }
        
        System.out.print("Arreglo primos: ");
        for (int i = 0; i < primos.size(); i++) {
            System.out.print(primos.get(i) + " ");
        }
        System.out.println("- Longitud: " + primos.size());
        
        System.out.print("Arreglo no primos: ");
        for (int i = 0; i < noPrimos.size(); i++) {
            System.out.print(noPrimos.get(i) + " ");
        }
        System.out.println("- Longitud: " + noPrimos.size());

       
    }


}