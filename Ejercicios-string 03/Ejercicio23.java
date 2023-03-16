import java.util.Scanner;

public class Ejercicio23{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = entrada.nextInt();
        entrada.nextLine();

        String[] arreglo = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextLine();
        }

        
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = entrada.nextLine();

        
        boolean encontrada = false;
        for (int i = 0; i < size; i++) {
            if (arreglo[i].toLowerCase().contains(palabra.toLowerCase())) {
                encontrada = true;
                System.out.println("-> Posición " + i + ": " + arreglo[i]);
            }
        }

        
        if (!encontrada) {
            System.out.println("La palabra no se encontró en el arreglo.");
        }

       
    }


}