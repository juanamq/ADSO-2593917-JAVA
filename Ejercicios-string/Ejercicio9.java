import java.util.Scanner;

public class Ejercicio9{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = entrada.nextLine();
        
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = entrada.nextLine();
        
        StringBuilder palabraCompuesta = new StringBuilder();
        int longitudMinima = Math.min(palabra1.length(), palabra2.length());
        
        for (int i = 0; i < longitudMinima; i++) {
            palabraCompuesta.append(palabra1.charAt(i));
            palabraCompuesta.append(palabra2.charAt(i));
        }
        
        if (palabra1.length() > palabra2.length()) {
            palabraCompuesta.append(palabra1.substring(longitudMinima));
        } else if (palabra2.length() > palabra1.length()) {
            palabraCompuesta.append(palabra2.substring(longitudMinima));
        }
        
        System.out.println("Resultado: " + palabraCompuesta);
    }

       
}

