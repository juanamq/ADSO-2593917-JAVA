import java.util.Scanner;

public class Ejercicio4{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        
        int opcion = 0;
        while (opcion <=3){
            System.out.println("|-----------Bienvenido-------------|");
            System.out.println("| 1.Docente                        |");
            System.out.println("| 2.Estudiante                     |");
            System.out.println("| 3.Salir                          |");
            System.out.println("|----------------------------------|");

            System.out.print("=> Ingrese una opcion:");
            opcion = entrada.nextInt();

            if(opcion == 1){
            System.out.println("-Docente-");

            }

            if (opcion == 2){
            System.out.println("-Estudiante-");

            }

            if(opcion == 3){
            System.out.println("-Salir-");
            }
        }

        
    }

}    