import java.util.Scanner;

public class Ejercicio8{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        System.out.print("Ingrese un número: ");
        int n = entrada.nextInt();
        

        String nuevaFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            int newPos = i - n;
            if (newPos < 0) {
                newPos += frase.length();
            }
            nuevaFrase += frase.charAt(newPos);
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Resultado: " + nuevaFrase);

       
    }


}