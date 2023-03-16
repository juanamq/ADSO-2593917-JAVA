import java.util.Scanner;

public class Arreglos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);


        //crear arreglo vacio
        int [] arreglo_1 = new int [5];
        //crear arreglo con numeros pares
        for(int i=0; i< arreglo_1.length; i++){
            arreglo_1[i]=(i+1)*2;

        }
        for(int i=0; i<arreglo_1.length;){
            System.out.print("["+arreglo_1[i]+"]");
        }

    

    }
}