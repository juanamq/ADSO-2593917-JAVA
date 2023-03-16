import java.util.Scanner;

public class Ejercicio4{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Usuario ingrese el primer numero");
        int n1 = entrada.nextInt();

        System.out.println("Usuario ingrese el segundo numero");
        int n2 = entrada.nextInt();

        System.out.println("Usuario ingrese el tercer numero");
        int n3 = entrada.nextInt();

        if(n1 > n2 && n1 > n3){
           System.out.println("El mayor numero es:"+n1); 

        }else if(n2 > n1 && n2 > n3){
           System.out.println("El mayor numero es:"+n2); 

        }else if (n3 > n1 && n3 > n2){
            System.out.println("El mayor numero es:"+n3);
        } 

        if (n1 < n2 && n1 < n3){
            System.out.println("El menor numero es:"+n1); 

        }else if (n2 < n1 && n2 < n3){
            System.out.println("El menor numero es:"+n2);

        }else{
            System.out.println("El menor numero es:"+n3);
        }

        System.out.println("Estos fueron los numeros ingresados:"+n1 +n2 +n3);

    }
}