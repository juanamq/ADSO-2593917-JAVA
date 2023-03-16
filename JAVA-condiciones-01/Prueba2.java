import java.util.Scanner;
public class Prueba2{
    public static void main(String []args){

        //creación de varible de netrada
        Scanner entrada = new Scanner(System.in);

        //creación de variable 
        int cant_poblacion_col=0;
        int cant_poblacion_usa=350000000;

        //Instrucción de salida
        System.out.println("La poblacion de COL es:"+ cant_poblacion_col);
        System.out.println("La poblacion de USA es:"+ cant_poblacion_usa);

        //Lectura de datos
        System.out.println("Ingrese poblacion de COL");
        cant_poblacion_col = entrada.nextInt();
                                                                                                                                               
        System.out.println("La nueva poblacion de Col es:"+ cant_poblacion_col);

        
    }

}
