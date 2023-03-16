import java.util.Scanner;

public class Ejercicio4{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese palabra:");
        String palabra = entrada.nextLine();

        String palindromo = "";

        if(palindromo == palabra){
            System.out.print("La palabra "+palabra+" es Palindroma");
        }else{
            System.out.print("La palabra "+palabra+" no es Palindroma");
        }
    }


}
