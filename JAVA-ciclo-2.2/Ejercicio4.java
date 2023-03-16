import java.util.Scanner;

public class Ejercicio4{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;           
        int num2 = 0;           
        int num3 = 0;           
        int num4 = 0;           
        int num5 = 0;

        System.out.println("=> Usuario ingrese un numero N");
        int N = entrada.nextInt();

        num1 = N /10000;           
        num2 = (N %10000)/1000;           
        num3 = (N %1000)/100;           
        num4 = (N %100)/10;           
        num5 = (N %10)/1;

        if(num1==num5 && num2==num4){
           
            System.out.println("Respuesta: El numero SI es PALINDROMO");

        }else{
           System.out.println("Respuesta: El numero NO es PALINDROMO");  
        }



        
    }

}