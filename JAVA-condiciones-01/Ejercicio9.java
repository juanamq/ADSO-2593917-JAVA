import java.util.Scanner;

public class Ejercicio9{
    public static void main (String [] args){


        Scanner entrada= new Scanner (System.in);
        
        System.out.println("Ingrese un numero ");
        int numero = entrada.nextInt();

        int digito_1 = (numero % 10);
        int digito_2 = (numero / 10)%10;
        int digito_3 = (numero / 100)%10;
        int digito_4 = (numero / 1000)%10;
        int digito_5 = (numero / 10000)%10;
        int digito_6 = (numero / 100000);

        if(digito_4==9){
            if(digito_3==0){
                System.out.println("NOVENTA");
            }else{
                System.out.println("NOVENTA DE");
            }
        }else if (digito_4==8 ){
             if(digito_3==0){
                System.out.println("OCHENTA");
            }else{
                System.out.println("OCHENTA DE");
            }
           
        }else if (digito_4==7 ){
             if(digito_3==0){
                System.out.println("SETENTA");
            }else{
                System.out.println("SETENTA DE");
            }
        }else if (digito_4==6 ){
             if(digito_3==0){
                System.out.println("SESENTA");
            }else{
                System.out.println("SESENTA DE");
            }
        }else if (digito_4==5 ){
             if(digito_3==0){
                System.out.println("CICUENTA");
            }else{
                System.out.println("CICUENTA DE");
            }
        }else if (digito_4==4 ){
             if(digito_3==0){
                System.out.println("CUARENTA");
            }else{
                System.out.println("CUARENTA DE");
            };
        }else if (digito_4==3 ){
             if(digito_3==0){
                System.out.println("TREINTA");
            }else{
                System.out.println("TREINTA DE");
            }
        }else if (digito_4==2 ){ 
            if(digito_4==0 && digito_3==0){
                System.out.println("VEINTE");
            }else{
                System.out.println("VEINTI");
            }
        }else if (digito_4==1){
           if(digito_3==0){
            System.out.println("DIEZ");
           }else if(digito_3==1){
            System.out.println("ONCE");
           }else if(digito_3==2){
            System.out.println("DOCE");
           }else if(digito_3==3){
            System.out.println("MARZO");
           }else if(digito_3==4){
            System.out.println("CATORCE");
           }else if(digito_3==5){
            System.out.println("QUINCE");
           }else{
            System.out.println("DIECI");
           }
               
        }else if(digito_4==0){
            System.out.println("");
        }
        if(digito_3==9){
            if(digito_2==0){
                System.out.println("NOVENTA");
            }else{
                System.out.println("NOVENTA DE");
            }
        }else if (digito_3==8 ){
             if(digito_2==0){
                System.out.println("OCHENTA");
            }else{
                System.out.println("OCHENTA DE");
            }
           
        }else if (digito_3==7 ){
             if(digito_2==0){
                System.out.println("SETENTA");
            }else{
                System.out.println("SETENTA DE");
            }
        }else if (digito_3==6 ){
             if(digito_2==0){
                System.out.println("SESENTA");
            }else{
                System.out.println("SESENTA DE");
            }
        }else if (digito_3==5 ){
             if(digito_2==0){
                System.out.println("CICUENTA");
            }else{
                System.out.println("CICUENTA DE");
            }
        }else if (digito_3==4 ){
             if(digito_2==0){
                System.out.println("CUARENTA");
            }else{
                System.out.println("CUARENTA DE");
            };
        }else if (digito_3==3 ){
             if(digito_2==0){
                System.out.println("TREINTA");
            }else{
                System.out.println("TREINTA Y");
            }
        }else if (digito_3==2 ){ 
            if(digito_2==0 && digito_3==0){
                System.out.println("VEINTE");
            }else{
                System.out.println("VEINTI");
            }
        }else if (digito_3==1){
           if(digito_2==0){
            System.out.println("DIEZ");
           }else if(digito_2==1){
            System.out.println("ONCE");
           }else if(digito_2==2){
            System.out.println("FEBRERO");
           }else if(digito_2==3){
            System.out.println("TRECE");
           }else if(digito_2==4){
            System.out.println("CATORCE");
           }else if(digito_2==5){
            System.out.println("QUINCE");
           }else{
            System.out.println("DIECI");
           }
               
        }else if(digito_2==0){
            System.out.println("");
        }

        if(digito_1==9){
            System.out.println("NUEVE");
        }else if (digito_1==8 ){
            System.out.println("OCHO");
        }else if (digito_1==7 ){
            System.out.println("SIETE");
        }else if (digito_1==5 ){
            System.out.println("CINCO");
        }else if (digito_1==4 ){
            System.out.println("CUATRO");
        }else if (digito_1==3 ){
            System.out.println("TRES");
        }else if (digito_1==2 ){
            System.out.println("DOS");
        }else if (digito_1==1 ){ 
            if(digito_3==0 && digito_2==0){
                System.out.println("ENERO");
            }else{
                System.out.println("CIENTO");
            }
        }else if (digito_1==0){
            System.out.println("");
        }

        System.out.println("El texto del numero es:"+numero);
    }
}