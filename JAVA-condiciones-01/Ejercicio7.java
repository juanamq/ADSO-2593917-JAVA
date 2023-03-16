import java.util.Scanner;

public class Ejercicio7{
    public static void main (String [] args){


        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número (máximo 10 dígitos e inferior a 2000000000): ");
            numero = entrada.nextInt();
        } while (numero < 0 || numero >= 2000000000);

        int divisor = 1000000; 
        if (numero < 1000000000) {
            divisor = 1000; 
        }
        int parteEntera = numero / divisor; 
        int parteDecimal = numero % divisor; 
        System.out.println("// ---------- FORMATO DE MONEDA ----------- //");
        System.out.print("Moneda: $ ");
        if (parteEntera >= 1000) {
            System.out.print(parteEntera / 1000 + ".");
            System.out.print((parteEntera % 1000) / 100 + ".");
            System.out.print((parteEntera % 100) / 10 + ".");
            System.out.print(parteEntera % 10 + ".");
        } else {
            System.out.print(parteEntera + ".");
        }
        if (parteDecimal < 10) {
            System.out.print("00" + parteDecimal);
        } else if (parteDecimal < 100) {
            System.out.print("0" + parteDecimal);
        } else {
            System.out.print(parteDecimal);
        }
        System.out.println();
        

        
    }
}