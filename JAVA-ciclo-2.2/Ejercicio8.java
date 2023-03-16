import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
   
    Scanner entrada = new Scanner(System.in);
    int contador = 1;
    boolean esPrimo;
    int divisor;
    int num=3;


    System.out.println("=> Usuario ingrese un numero N");
    int n= entrada.nextInt();

    while (contador < n){
      esPrimo = true;
      divisor=3;
      while ((divisor<=Math.sqrt((num))) && esPrimo) {
        if (num%divisor==0) {
          esPrimo = false;
        }
        divisor +=2;
      }
      if (esPrimo){
        contador +=1;
        System.out.println(contador + ": " + num);
      }
      num +=2;
    }
    
    if(n>=2 && n<=50){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print( " "+ num);
            }
            System.out.println(" ");

        }
    } 
    
  }
}
