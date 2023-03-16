import java.util.Scanner;

public class Ejercicio10{
    public static void main (String [] args){

        Scanner entrada= new Scanner (System.in);

        int promedio=0;

        System.out.println("usuario ingrese el nombre de la materia 1:");
        int materia1 = entrada.nextInt();

        System.out.println("usuario ingrese la nota de:"+materia1);
        int nota1 = entrada.nextInt();

        System.out.println("usuario ingrese el nombre de la materia 2:");
        int materia2 = entrada.nextInt();

        System.out.println("usuario ingrese la nota de:"+materia2);
        int nota2 = entrada.nextInt();

        System.out.println("usuario ingrese el nombre de la materia 3:");
        int materia3 = entrada.nextInt();

        System.out.println("usuario ingrese la nota de:"+materia3);
        int nota3 = entrada.nextInt();

        System.out.println("usuario ingrese el nombre de la materia 4:");
        int materia4 = entrada.nextInt();

        System.out.println("usuario ingrese la nota de:"+materia4);
        int nota4 = entrada.nextInt();

        System.out.println("usuario ingrese el nombre de la materia 5:");
        int materia5 = entrada.nextInt();

        System.out.println("usuario ingrese la nota de:"+materia5);
        int nota5 = entrada.nextInt();

        promedio=nota1+nota2+nota3+nota4+nota5/5;


        if(promedio > 10){ 
            System.out.println("usuario ingrese la nota de:"+materia5);

        }

        


        


        




    }
}