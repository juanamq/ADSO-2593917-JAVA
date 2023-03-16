import java.util.Scanner;

public class Ejercicio3{
  public static void main(String [] args){

    Scanner entrada = new Scanner (System.in);

    System.out.print("Ingresar un nombre:");
    String nombre = entrada.nextLine();

    String invertida = "";

    for (int i = nombre.length()-1; i >= 0; i--) {

      invertida = invertida + nombre.charAt(i);

    }


    System.out.print("Nombre invertido:"+invertida);

  }

}