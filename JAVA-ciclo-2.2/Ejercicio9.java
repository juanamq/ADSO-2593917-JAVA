import java.util.Scanner;

public class Ejercicio9{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int factorial=0;

        System.out.println("=> Usuario ingrese un numero N");
        int N = entrada.nextInt();

        for(int i = 1; i<= N; i++){

            factorial=factorial+i;
        }
        System.out.println("Raiz Digital:");
        for(int i = 1; i<= N; i++){
            System.out.print(i+"+");
            if(i==N){
                System.out.print("="+factorial);

                System.out.println("La raiz Digital de  "+N+ "  es:"+factorial);
        }   } 
 

    }
}
