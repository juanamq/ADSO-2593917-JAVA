import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor total a financiar: ");
        int valorTotal = entrada.nextInt();
        
        System.out.print("Ingrese la tasa de interés anual: ");
        double tasaInteresAnual = entrada.nextDouble();
        
        System.out.print("Ingrese la cantidad de cuotas: ");
        int cantidadCuotas = entrada.nextInt();
        
        
        double tasaInteresMensual = tasaInteresAnual / 12 / 100;
        
        
        double valorCuotaMensual = (valorTotal * tasaInteresMensual) / (1 - Math.pow(1 + tasaInteresMensual, -cantidadCuotas));
        
        
        double deudaTotal = valorTotal;
        for (int i = 1; i <= cantidadCuotas; i++) {
            double interes = deudaTotal * tasaInteresMensual;
            double abonoCapital = valorCuotaMensual - interes;
            deudaTotal -= abonoCapital;
            System.out.printf(" Cuota:"+valorCuotaMensual+"Interés:" +interes+"abono a capital"+abonoCapital+"deuda total:"+deudaTotal);
        }


    }
}