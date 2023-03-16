import java.util.Scanner;

public class Ejercicio7{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Usuario ingrese un numero N");
        int n= entrada.nextInt();

        int x=(n+1)/2;

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
        x=x+1;
        for(int j=x; j<= n; j++){

           for(int y=x; y<=n-j; y++)
           {
            System.out.print(" ");
           }
           for(int m=x; m<=(x*2); m++){

            System.out.print("x");
           }
           System.out.println();

        }
        
        
    }
}
