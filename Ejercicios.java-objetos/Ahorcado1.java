import java.util.Scanner;

public class Ahorcado1{
    private String palabraSecreta;
    private int intentosRestantes;
    private boolean[] letrasDescubiertas;
    private boolean partidaFinalizada;
    
    public Ahorcado1(String palabraSecreta, int intentosIniciales) {
        this.palabraSecreta = palabraSecreta.toUpperCase();
        this.intentosRestantes = intentosIniciales;
        this.letrasDescubiertas = new boolean[this.palabraSecreta.length()];
        this.partidaFinalizada = false;
    }
    
    public void start() {
        System.out.println("¡Bienvenido al juego del ahorcado!");
        Scanner scanner = new Scanner(System.in);
        
        while (!partidaFinalizada) {
            System.out.println("Palabra: " + getPalabraActual());
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Ingrese una letra: ");
            String letraIngresada = scanner.nextLine().toUpperCase();
            chequearLetra(letraIngresada.charAt(0));
        }
        
        if (intentosRestantes > 0) {
            System.out.println("¡Felicidades, has ganado!");
        } else {
            System.out.println("¡Oh no, has perdido! La palabra secreta era " + palabraSecreta);
        }
        
        scanner.close();
    }
    
    private String getPalabraActual() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (letrasDescubiertas[i]) {
                sb.append(palabraSecreta.charAt(i)).append(" ");
            } else {
                sb.append("_ ");
            }
        }
        
        return sb.toString();
    }
    
    private void chequearLetra(char letra) {
        boolean letraAcierto = false;
        
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                letrasDescubiertas[i] = true;
                letraAcierto = true;
            }
        }
        
        if (!letraAcierto) {
            intentosRestantes--;
            if (intentosRestantes == 0) {
                partidaFinalizada = true;
            }
        } else if (getPalabraActual().indexOf("_") == -1) {
            partidaFinalizada = true;
        }
    }
}