import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total financiada: ");
        int cantidadFinanciada = entrada.nextInt();

        System.out.print("Ingrese la cantidad de cuotas pagadas: ");
        int cantidadCuotasPagadas = entrada.nextInt();

        System.out.print("Ingrese el valor de cada cuota: ");
        int valorCuota = entrada.nextInt();

        
        int totalPagado = cantidadCuotasPagadas * valorCuota;
        int interesPagado = (totalPagado - cantidadFinanciada) * 100 / cantidadFinanciada;

        
        System.out.println("El total pagado es: $" + totalPagado);
        System.out.println("El interés pagado es del " + interesPagado + "%");

    }
}