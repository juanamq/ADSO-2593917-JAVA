import java.util.Scanner;

public class Ejercicio10{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("|-------------------|");
        System.out.print("=> Ingresar numero:");
        int numero = entrada.nextInt();


        for(int i=1; i<=numero; i++){

            int contador=0;

            for(int j=1; j<=i; j++){

                if(i%j==0){
                    contador++;
                }
        
            }
            if(contador==2){

                System.out.println("--> Los numeros primos encontrados son:");
                System.out.println(i);

                System.out.println("|--------------------------------------|");

                
            }


           

        }
        
    }
}