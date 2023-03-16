import java.util.Scanner;

public class Ejercicio13{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = entrada.nextInt();
        String[] nombres = new String[n];
        
        
        System.out.println("Ingrese los nombres de las personas:");
        for (int i = 0; i < n; i++) {
            nombres[i] = sc.next();
        }
        
        
        System.out.println("Arreglo original: " + Arrays.toString(nombres));
        
        
        Arrays.sort(nombres);
        
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(nombres));

       
    }


}