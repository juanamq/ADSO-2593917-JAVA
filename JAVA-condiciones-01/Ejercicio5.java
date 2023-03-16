import java.util.Scanner;

public class Ejercicio5{
    
   public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);
    int mayor=0;
    int menor=0;
    int mitad = mayor - menor;

    System.out.println("Usuario ingrese el primer numero entero");
    int n1 = entrada.nextInt();

    System.out.println("Usuario ingrese el segundo numero entero");
    int n2 = entrada.nextInt();

    System.out.println("Usuario ingrese el tercer numero entero");
    int n3 = entrada.nextInt();

    if ( n1 > n2 && n1 > n3){
        mayor=n1; 

    }else if ( n2 > n1 && n2 > n3){
        mayor=n2;

    }else{
        mayor=n3;
    }

    if ( n1 < n2 && n1 < n3){
        menor=n1;

    }else if ( n2 < n1 && n2 < n3){
       menor=n2;

    }else{
       menor=n3;
    }
    


    System.out.println("los numeros ingresados en orden ascendente son:"+mitad); 
     
    
    

   }

}

   