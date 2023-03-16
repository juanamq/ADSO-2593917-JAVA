import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {

        Scanner entrada= new Scanner (System.in);
        int numeros[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        System.out.println("Antes de ordenar: " + Arrays.toString(numeros));
        // Ordenar. Modifica internamente al arreglo
        Arrays.sort(numeros);
        System.out.println("Después de ordenar: " + Arrays.toString(numeros));

        // Otro ejemplo con cadenas
        String nombres[] = {"Luis", "María", "Pedro", "Angela", "Elliot", "Mobley"};

        System.out.println("Antes de ordenar: " + Arrays.toString(nombres));
        // Ordenar. Modifica internamente al arreglo
        Arrays.sort(nombres);
        System.out.println("Después de ordenar: " + Arrays.toString(nombres));


    }
}