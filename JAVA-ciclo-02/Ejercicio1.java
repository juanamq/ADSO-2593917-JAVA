import java.util.Scanner;

public class Ejercicio1{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("=> Usuario ingrese la cantidad de notas");
        int cantidad = entrada.nextInt();

        float sumatoria = 0;
        for (int i=1; i<=cantidad; i++){
            System.out.print("-> Ingrese nota"+i+":");
            float nota = entrada.nextFloat();
            sumatoria=sumatoria + nota;
        } 
        float promedio = sumatoria / cantidad;
        System.out.print("-> El promedio es:"+promedio);
    }

} 