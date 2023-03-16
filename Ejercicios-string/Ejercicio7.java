import java.util.Scanner;

public class Ejercicio7{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = entrada.nextLine();

        boolean valida = true;

        if (contrasena.length() < 8) {
            valida = false;
        }
        if (!contrasena.matches(".*[A-Z].*")) {
            valida = false;
        }
        if (!contrasena.matches(".*[a-z].*")) {
            valida = false;
        }
        if (!contrasena.matches(".*\\d.*")) {
            valida = false;
        }
        if (!contrasena.matches(".*[.\\-*{}\\[\\]#$%&/?¡!].*")) {
            valida = false;
        }
        if (contrasena.matches(".*\\s.*")) {
            valida = false;
        }

        System.out.print("Resultado:");

        if (valida) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida.");
        }
    }


}