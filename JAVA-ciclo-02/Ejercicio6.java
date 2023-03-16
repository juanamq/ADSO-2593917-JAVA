import java.util.Scanner;

public class Ejercicio6{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int a=0, b=1, c=1, n;

        System.out.print("=> Ingrese la posicion del n-esimo fibonacci:");
        n = entrada.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(a);
            a=b;
            b=c;
            c=a+b;
        }
        System.out.print("=> El n-esimo numero fibonacci es:");

    }
}