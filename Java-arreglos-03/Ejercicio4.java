import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numeros[]= new float[5];

        for(int i=0;i<5; i++){

            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextFloat();
 
        }
        System.out.print("orden:");
        for(float i:numeros){

            System.out.print(i);

        }


    }
}