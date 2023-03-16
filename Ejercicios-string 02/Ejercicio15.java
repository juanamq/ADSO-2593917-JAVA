import java.util.Scanner;

public class Ejercicio15{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese su nombre de usuario:");
        String nombreUsuario = entrada.nextLine();
        
       
        do {
            System.out.println("\nBienvenido(a) " + nombreUsuario + " al sistema de pagos de 2019");
            System.out.println("Seleccione una opción:");
            System.out.println("1: Registrar pago mensual - año 2019.");
            System.out.println("2: Ver Pago todos los meses - año 2019.");
            System.out.println("3: Ver Pago mes especifico.");
            System.out.println("4: Salir.");
            String opcion = entrada.nextLine();

            if(opcion == 1){
                System.out.println("Ha seleccionado la opción 1: Registrar pago mensual.");
            }if else(opcion == 2){
                System.out.println("Ha seleccionado la opción 2: Ver Pago todos los meses.");

            }if else(opcion == 3){
                System.out.println("Ha seleccionado la opción 3: Ver Pago mes especifico.");

            }if else(opcion == 4){
                System.out.println("Ha seleccionado la opción 4: Salir.");
                salir = true;
                break;

            }
            
            
        } while (!salir);
        
        System.out.println("");

       
    }


}