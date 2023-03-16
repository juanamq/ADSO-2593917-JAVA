import java.util.Scanner;

public class Ejercicio7{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        
        int i=0;
        int may=0;

        System.out.print("=> Ingrese un numero:");
        int n1 = entrada.nextInt();

        System.out.print("=> Ingrese un numero:");
        int n2 = entrada.nextInt();

        System.out.print("=> Ingrese un numero:");
        int n3 = entrada.nextInt();
        may=n1;
        i=may;
        while((i%n1!=0)||(i%n2!=0)||(i%n3!=0)){

            if(n2>may){
              may=n2;
            }else if(n3>may){
                may=n3;
            }

            i++;
        
        }
        System.out.print("El MCM es:"+i);
        

        

        
        


    }
}