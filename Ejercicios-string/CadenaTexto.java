import java.util.Scanner;

public class CadenaTexto{
    public static void main(String [] args){

        // Variable para leer datos.
        Scanner entrada = new Scanner (System.in);

        // Pedir texto al usuario.
        System.out.print("Ingrese su nombre:");
        String cadena = entrada.nextLine();

        // Pruebas
        System.out.println("Valor almacenado =>" +cadena);
        System.out.println("Cantidad letras =>" +cadena.length());
        System.out.println("Letra en Pos 0 =>"+cadena.charAt(0));
        System.out.println("Letra en Pos 1 =>"+cadena.charAt(1));
        System.out.println("Letra en Pos 2 =>"+cadena.charAt(2));
        System.out.println("Letra en Pos 3 =>"+cadena.charAt(3));

        String palabra_1 = "Hola";
        String palabra_2 = "Mundo";

        System.out.println("CompareTo P1 a P2:" + palabra_1.compareTo(palabra_2));
        System.out.println("CompareTo P2 a P1:" + palabra_2.compareTo(palabra_1));

        //String palabra_1 = "a";
        //String palabra_2 = "A";

        System.out.println("equals P1 a P2:" + palabra_1.equals(palabra_2));
        System.out.println("equals P2 a P1:" + palabra_2.equals(palabra_1));

        String palabra_1 = "Hola Mundo";
        String palabra_2 = "hOLA muNDO";

        System.out.println("equals P1 a P2:" + palabra_1.equalsIgnoreCase(palabra_2));
        System.out.println("equals P2 a P1:" + palabra_2.equalsIgnoreCase(palabra_1));



    }


}