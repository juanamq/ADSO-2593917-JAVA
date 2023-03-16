import java.util.Scanner;

public class Ejercicio10{
   public static void main(String[] args) {
        int FILAS = 5;
        int COLS = 5;
        Scanner entrada = new Scanner(System.in);

        System.out.println("=> Usuario ingrese un numero N");
        int n = entrada.nextInt();
        int N[][]= new int [FILAS][COLS];

        System.out.println("cuadro Latino:");
       
        for (int fil = 0; fil < FILAS; fil++) {
            for (int col = 0; col < COLS; col++) {
                
                if (fil==0) N[fil][col]=col+1;
                
                else if(col==0) N[fil][col]= N[fil-1][COLS-1];
             
                else N[fil][col]= N[fil-1][col-1];
            }
        }
       
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (N [i][j]<10) System.out.printf("   %d",N[i][j]);
                else System.out.printf("  %d",N [i][j]);
            }
            System.out.println();
        }
       
   
    }
}