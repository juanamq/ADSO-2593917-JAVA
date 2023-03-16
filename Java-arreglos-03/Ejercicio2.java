import java.util.Scanner;

public class Ejercicio2{
    public static void main (String [] args){
        int n, i, cnp = 0, res;
        System.out.println("Ingrese un numero ");
        
        n = (int) (Math.random() * 100);

        int num[] = new int[n + 1];
        for (i = 0; i < n; i++) {
            num[i] = (int) (Math.random() * 100);
            res = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    res++;
                }
            }
            if (res == 2) {
                cnp++;
                System.out.println("numero primo =" + num[i]);
            }

        }
        System.out.println("La cantidad de numeros primos es :" + cnp);
    }
    
    

}
