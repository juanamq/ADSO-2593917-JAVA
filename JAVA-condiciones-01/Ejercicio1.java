import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        int auxilio=800000;
        int impuesto=200000;

        System.out.println("Hola usuario");
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        if (edad >= 18 && edad <=150){ 
            System.out.println("Paga un impuesto de:"+ impuesto);

            
        }else if (edad <=18){
            System.out.println("Resive un auxilio de:"+ auxilio);
        }
    }
}