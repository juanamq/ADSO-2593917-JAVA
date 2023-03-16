import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {


        Scanner entrada = new Scanner (System.in);

        System.out.println("=> Usuario ingrese un numero");
        int numero= entrada.nextInt();

        int [] arreglo_1 = new int [5];
       
        for(int i=0; i< arreglo_1.length; i++){
            arreglo_1[i]=((i+1)*2)-1;

        }
        for(int i=0; i<arreglo_1.length;){
            System.out.print("["+arreglo_1[i]+"]");
        }
        


    }
}