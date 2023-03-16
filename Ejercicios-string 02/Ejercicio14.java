import java.util.Scanner;

public class Ejercicio14{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el número de personas: ");
        int numPersonas = scanner.nextInt();
        scanner.nextLine();
        
        
        String[] nombres = new String[numPersonas];
        String[] generos = new String[numPersonas];
        
        
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese el género de la persona " + (i+1) + " (Hombre/Mujer): ");
            generos[i] = scanner.nextLine();
        }
        
        
        for (int i = 0; i < numPersonas; i++) {
            System.out.println("[ " + nombres[i] + " -> " + generos[i] + " ]");
        }

       
    }


}