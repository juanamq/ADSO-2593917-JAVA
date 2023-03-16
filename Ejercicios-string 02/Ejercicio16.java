import java.util.Scanner;

public class Ejercicio16{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = entrada.nextInt();
        String[] arreglo = new String[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese un valor para la posición " + i + ": ");
            arreglo[i] = entrada.nextLine();
        }

        
        System.out.print("Ingrese la posición inicial para anti horario: ");
        String posicion = entrada.nextLine();

        
        System.out.print("Arreglo original: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        
        System.out.print("Anti horario: ");
        for (int i = posicion; i != posicion - 1; i--) {
            if (i < 0) {
                i = size - 1;
            }
            System.out.print(arreglo[i] + " ");
        }

       
    }


}