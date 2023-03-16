import java.util.Scanner;

public class Ejercicio1{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Usuario ingrese un numero entre 1 y 6");
        int n = entrada.nextInt();

        int construido=0;

        for(int i=1; i<=n; i++){
            int aleatorio =(int)(Math.random()*10);

            construido=construido*10+aleatorio;
        }
        System.out.println("El numero construido es:" +construido);
        System.out.println("El resultado producto es :" +construido*2);
    }
} 