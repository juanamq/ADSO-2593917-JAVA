import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String [] args){

        
    Scanner entrada= new Scanner (System.in);

    System.out.println("Ingrese un numero ");
    int numero = entrada.nextInt();

    System.out.println("//----------------------------//");
    System.out.println("Menu");

    System.out.println("1.primer digito");
    System.out.println("2.primer digito");
    System.out.println("3.primer digito");
    System.out.println("4.primer digito");
    System.out.println("5.primer digito");
    System.out.println("6.primer digito");
    
    System.out.println("//----------------------------//");

    System.out.println("usuario ingrese una opcion");
    int opcion = entrada.nextInt();


    if (numero<=10){ 

        opcion=numero;
        System.out.println("el digito es:"+opcion);

    }
    }

}