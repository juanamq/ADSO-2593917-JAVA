import java.util.Scanner;

public class Ejercicio1{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingresar una oracion:");
        String oracion = entrada.nextLine();

        int vocales = 0;

        for(int i=0; i < oracion.length();i++){

            if(oracion.charAt(i) == 'a' || oracion.charAt(i) == 'e' || oracion.charAt(i) == 'i' ||  oracion.charAt(i) == 'o' || oracion.charAt(i) == 'u'){

                vocales++;
                
            }else if (oracion.charAt(i) == 'A' || oracion.charAt(i) == 'E' || oracion.charAt(i) == 'I' ||  oracion.charAt(i) == 'O' || oracion.charAt(i) == 'U'){
                vocales++;

            }

        } 
        System.out.print("La cantidad de vocales es:"+vocales);





    }


}