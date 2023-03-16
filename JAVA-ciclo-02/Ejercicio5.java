import java.util.Scanner;

public class Ejercicio5{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int aux=0; 
        int fib=1;
        int codi;
        int n;
       

        System.out.print("=> Ingrese un numero:");
        n = entrada.nextInt();


        for(int i = 3; i<=n; i++){
           System.out.print(aux);

            aux=fib; 
            fib=codi;
            codi=aux+fib;
        }

        
        System.out.print("La sucesion de Fibonacci es:");
    }
}