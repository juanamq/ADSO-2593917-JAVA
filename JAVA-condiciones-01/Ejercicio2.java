import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String [] args){
        
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese un numero de tres digitos");
        int numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("El numero es PAR");

        }else{
           System.out.println("El numero es IMPAR"); 
            
        }

    
        


        


    }



}
