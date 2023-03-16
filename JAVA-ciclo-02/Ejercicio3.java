import java.util.Scanner;

public class Ejercicio3{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("=> Usuario ingrese la cantidad de altura de la piramide");
        n = entrada.nextInt();


        for(int i=1; i<= n; i++){

           for(int j=1;j<= n-i;j++)
           {
            System.out.print(" ");
           }
           for(int m=1; m<=(i*2)-1; m++){

            System.out.print("x");
           }
           
           System.out.println();

        }
        
        


    }

}

        
    