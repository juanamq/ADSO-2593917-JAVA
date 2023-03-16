import java.util.Scanner;

public class Ejercicio8{
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int acum=0;

        System.out.print("=> Ingresar un numero:");
        int numero = entrada.nextInt();
        System.out.println("---------------------");
         
        int digit_1=(numero/10)%10;
        int digit_2=(numero/100)%10;
        int digit_3=(numero/1000)%10;
        int digit_4=(numero/10000)%10;
        int digit_5=(numero/100000)%10;
        int digit_6=(numero/1000000);

        for(int i=1; i<numero; i++){
            acum=i+1;
        }
        for(int i=1; i<numero-4; i++){
            System.out.println("el digito es:"+i);
        }

    }
    

    
}