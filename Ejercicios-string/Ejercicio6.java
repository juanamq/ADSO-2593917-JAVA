import java.util.Scanner;

public class Ejercicio6{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el nombre del primer jugador: ");
        String jugador1 = entrada.nextLine();
        System.out.print("Ingrese el nombre del segundo jugador: ");
        String jugador2 = entrada.nextLine();
        
        
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Iniciar juego");
            System.out.println("2. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = entrada.nextInt();

            if(opcion==1){
                char[][] tablero = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
                    boolean juegoTerminado = false;
                    boolean turnoJugador1 = true;
                    
                    while (!juegoTerminado) {
                        // Mostrar tablero
                        System.out.println("\n--- TURNO DE " + (turnoJugador1 ? jugador1 : jugador2) + " ---");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(tablero[i][j] + " ");
                            }
                            System.out.println();
                        }
                        
                        
                        int fila, columna;
                        do {
                            System.out.print("Ingrese la posición (1-9): ");
                            int posicion = sc.nextInt();
                            fila = (posicion - 1) / 3;
                            columna = (posicion - 1) % 3;
                        } while (tablero[fila][columna] != '-');
                        
                        
                        tablero[fila][columna] = turnoJugador1 ? 'X' : 'O';
                        
                        
                        char simbolo = turnoJugador1 ? 'X' : 'O';
                        if (tablero[fila][0] == simbolo && tablero[fila][1] == simbolo && tablero[fila][2] == simbolo ||
                            tablero[0][columna] == simbolo && tablero[1][columna] == simbolo && tablero[2][columna] == simbolo ||
                            fila == columna && tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo ||
                            fila + columna == 2 && tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
                            System.out.println("\n¡" + (turnoJugador1 ? jugador1 : jugador2) + " ha ganado!");
                            juegoTerminado = true;
                        } else if (!hayEspaciosVacios(tablero)) {
                            System.out.println("\n¡Empate!");
                            juegoTerminado = true;
                        }
                        
                        turnoJugador1 = !turnoJugador1;
                    }
                    break;

            }else if(opcion==2){
                salir = true;
                break;

            }
        }
   

        
    }


}