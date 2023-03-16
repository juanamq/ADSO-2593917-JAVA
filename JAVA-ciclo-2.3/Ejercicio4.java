import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
       
        int origen, destino, distancia, paradas, totalDistancia = 0;
        float consumoPorKm, precioPorLitro, totalCombustible = 0;
        int distanciaEntreCiudades = 0;
        
        
        System.out.print("Ingrese la ciudad de origen (1-6):");
        origen = entrada.nextInt();
        System.out.print("Ingrese la ciudad de destino (1-6): ");
        destino = entrada.nextInt();
        
        
        if (origen <= destino) {
            for (int i = origen; i < destino; i++) {
                totalDistancia = totalDistancia + distanciaEntreCiudades;
            }
        } else {
            for (int i = origen; i > destino; i--) {
                totalDistancia = totalDistancia + distanciaEntreCiudades;
            }
        }
        
    
        System.out.print("Ingrese la cantidad de paradas: ");
        paradas = entrada.nextInt();
        
        
        for (int i = 1; i <= paradas; i++) {
            System.out.print("Ingrese la ciudad de la parada " + i + " (1-6): ");
            int ciudad = entrada.nextInt();
            totalDistancia = totalDistancia + distanciaEntreCiudades+destino+ciudad;
            destino = ciudad;
        }
        
        
        System.out.print("Ingrese el consumo de combustible por kilómetro (en litros): ");
        consumoPorKm = entrada.nextFloat();
        System.out.print("Ingrese el precio por litro de combustible: ");
        precioPorLitro = entrada.nextFloat();
        
        
        totalCombustible = totalDistancia * consumoPorKm;
        
       
        float costoTotal = totalCombustible * precioPorLitro;
        
       
        System.out.println("Distancia total recorrida: " + totalDistancia + " km");
        System.out.println("Cantidad de combustible necesaria: " + totalCombustible + " litros");
        System.out.println("Costo total de la gasolina: $" + costoTotal);

    }
}