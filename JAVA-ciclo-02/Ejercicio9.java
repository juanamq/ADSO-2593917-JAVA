import java.util.Scanner;

public class Ejercicio9{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("=>Ingresar un numero ");
        int n= entrada.nextInt();
        
        int contador=0;

        for(int i=1; i<=n; i++){

            if(n%i==0){
                contador++;
            }
        }

        if(contador<=2){
            System.out.println("------------------------");
            System.out.print("=>El numero es primo");
           

        }else{
            System.out.println("--------------------------");
            System.out.print("=>El numero no es primo");
            
        }

        

    }
}