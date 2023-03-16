import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Usuario ingrese un fecha aleatoria");
        int n = entrada.nextInt();
        
        int dia=0;
        int mes=0;
        int year=0;

        for(int i=1; i<=2; i++){
            int aleatorio =(int)(Math.random()*10);
            dia=dia*10+aleatorio;
        }  
        for(int i=1; i<=2; i++){
           int aleatorio =(int)(Math.random()*10);
            mes=mes*10+aleatorio;
 
        }
        for(int j=1; j<=4; j++){
            int aleatorio =(int)(Math.random()*10);
            year=year*10+aleatorio;
        }
     System.out.println("=> Fecha generada:"+dia+mes+year);
    }

}