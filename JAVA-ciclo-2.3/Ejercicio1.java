import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el sueldo total: ");
        int sueldoTotal = entrada.nextInt();
        System.out.print("Ingrese la cantidad de pagos: ");
        int cantidadPagos = entrada.nextInt();

        
        System.out.println("-------------- FORMAS DE PAGO -----------------");
        System.out.println("1. Pagos de igual valor");
        System.out.println("2. Primer pago diferente");
        System.out.println("3. Ultimo pago diferente");
        System.out.println("4. Primer y Ultimo pago diferente");

        
        System.out.print("Ingrese la forma de pago: ");
        int formaPago = entrada.nextInt();

        
        int pagoNormal = sueldoTotal / cantidadPagos;
        int pagoExtra = sueldoTotal - (pagoNormal * (cantidadPagos - 1));

        
        System.out.println("------------- SUS PAGOS SERAN ------------------");

        if (formaPago == 1) {
            
            for (int i = 1; i <= cantidadPagos; i++) {
                System.out.println("Mes :"+i+pagoNormal);
            }
        } else if (formaPago == 2) {
            
            System.out.println("Mes :"+ pagoExtra);
            for (int i = 2; i <= cantidadPagos; i++) {
                System.out.println("Mes :"+i+ pagoNormal);
            }
        } else if (formaPago == 3) {
            
            for (int i = 1; i <= cantidadPagos - 1; i++) {
                System.out.println("Mes :"+ i+ pagoNormal);
            }
            System.out.printf("Mes : "+ cantidadPagos+ pagoExtra);
        } else if (formaPago == 4) {
            
            System.out.println("Mes 01:"+ pagoExtra);
            for (int i = 2; i <= cantidadPagos - 1; i++) {
                System.out.println("Mes :"+ i+ pagoNormal);
            }
            System.out.println("Mes :"+cantidadPagos+ pagoExtra);
        } else {
            
            System.out.println("Forma de pago inválida");
        }

        System.out.println("--------------------------------------------");

       



    }
        

}