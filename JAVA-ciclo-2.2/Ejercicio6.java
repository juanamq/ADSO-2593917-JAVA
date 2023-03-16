import java.util.Scanner;

public class Ejercicio6{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Usuario ingrese un numero N");
        int numero_n = entrada.nextInt();

        System.out.println("=> Usuario ingrese un numero M");
        int numero_m = entrada.nextInt();
        
        int factorial=1;
        int factorial_1=1;
       
        

        for(int i = 1; i<= numero_n; i++){
            factorial=factorial*i;
        }
        for(int i = 1; i<= numero_m; i++){
            factorial_1=factorial_1*i;
        }
        System.out.println("Factorial de "+numero_n+":"+factorial);
        for(int i = 1; i<= numero_n; i++){
            System.out.print(i+"x");
            if(i==numero_n ){
                System.out.println("="+factorial);
            }
        }
       
        System.out.println("Factorial de "+numero_m+":"+factorial_1);
        for(int i = 1; i<= numero_m; i++){
            System.out.print(i+"x");
            if(i==numero_m){
                System.out.println("="+factorial_1);
            }
        }
}   }
