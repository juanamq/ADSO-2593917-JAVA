import java.util.Scanner;

public class Ejercicio3{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Usuario ingrese un numero entero");
        int n = entrada.nextInt();

        int iterador=1;

       while (iterador<=n){
         int contador=0;
         int j=1; 
         int aleatorio =(int)(Math.random()*999);
         while (j<=aleatorio){
            if(aleatorio%j==0){
                contador++;
            }
            j++;  
        }
        if(contador==2){
            System.out.println("=> El primo "+iterador+" generado es: "+aleatorio);
            iterador++;
        }

       }

    



    }
}