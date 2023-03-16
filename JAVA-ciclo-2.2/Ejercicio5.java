import java.util.Scanner;

public class Ejercicio5{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int factorial=1;

        System.out.println("=> Usuario ingrese un numero N");
        int numero= entrada.nextInt();

        for(int i = 1; i<= numero; i++){

            factorial=factorial*i;
        }
        System.out.println("Factorial:");
        for(int i = 1; i<= numero; i++){
            System.out.print(i+"x");
            if(i==numero){
                System.out.print("="+factorial);
            }                                              
        }

    }
    
}
    
