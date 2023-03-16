import java.util.Scanner;

public class Ejercicio2{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingresar una oracion:");
        String oracion = entrada.nextLine(); 

        char letra = 0;

      for (int i = 0; i < oracion.length(); i++) {
          letra = (char) oracion.charAt(i);
          if (i % 2 == 0) {
            if (letra >= 'A' && letra <= 'Z' || letra == ' ') { 
                System.out.print(letra);
            } else if (letra >= 'a' && letra <= 'z' || letra == ' ') { 
                letra = (char) (letra - 'a' + 'A');
                System.out.print(letra); 
            }

        } else if (i % 2 != 0) {
            if (letra >= 'a' && letra <= 'z' || letra == ' ') { 
                System.out.print(letra);
            } else if (letra >= 'A' && letra <= 'Z' || letra == ' ') {
                                                            
                letra = (char) (letra + 'a' - 'A');
                System.out.print(letra);

            }
        }

    }



    }


}