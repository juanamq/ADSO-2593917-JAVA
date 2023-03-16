import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Usuario ingrese la cantidad de materias");
        int cantidad = entrada.nextInt();

        float sumatoria =0;
        float suma_nota=0;
        float promedio_ponderado=0;
        float promedio_semestre=0;
        float sumatoria_nota=0;
        int acum=0;


        for(int i=1; i <= cantidad; i++){
            System.out.print("->Ingrese la nota de la materias"+i+":");
            float nota  = entrada.nextFloat();

            System.out.print("=> Usuario ingrese los creditos de las materias"+i+":");
            int credi = entrada.nextInt();

            sumatoria=sumatoria + (nota * credi); 
            acum = acum + credi ;
    
        }

        System.out.println("-> Total de creditos :" + acum);
        System.out.println("-> Promedio del semestre :" + sumatoria/acum);

        
    }
}