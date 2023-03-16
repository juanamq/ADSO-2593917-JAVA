import java.util.Scanner;

public class Ejercicio3{
    public static void main (String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("ingresando cordenada en el plano cartesiano");

        System.out.println("ingrese el valor de x");
        int puntox = entrada.nextInt();

        System.out.println("ingrese el valor de y");
        int puntoy = entrada.nextInt();

        if(puntox==0 && puntoy==0){
           System.out.println("el punto:"+puntox+","+puntoy+" se envuentra en el origen"); 
        }else if(puntox>0 && puntoy>0){
            System.out.println("el punto:"+puntox+","+puntoy+" se envuentra en el primer cuadrante");

        }else if(puntox<0 && puntoy>0){
            System.out.println("el punto:"+puntox+","+puntoy+" se envuentra en el segundo cuadrante");
        }else if(puntox<0 && puntoy<0){
            System.out.println("el punto:"+puntox+","+puntoy+" se envuentra en el tercer cuadrante");
        }else if(puntox>0 && puntoy<0){
            System.out.println("el punto:"+puntox+","+puntoy+" se envuentra en el cuarto cuadrante");
        }

        else if(puntox==0 && puntoy>0 || puntoy<0){
            System.out.println("el punto:"+puntox+","+puntoy+" se envuentra en el eje de la x");

        }else if(puntox>0 || puntox<0 && puntoy==0){
            System.out.println("el punto:"+puntox+","+puntoy+" se envuentra en el eje de la y");
        }


        
    }
}
