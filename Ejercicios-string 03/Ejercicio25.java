import java.util.Scanner;

public class Ejercicio25{
    public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = entrada.nextLine();
        int opcion;
        int MAX_REGISTROS = 100;   
        String[] departamentos = new String[MAX_REGISTROS];
        String[] municipios = new String[MAX_REGISTROS];
        int[] habitantes = new int[MAX_REGISTROS];
        int[] alturas = new int[MAX_REGISTROS];
        int registros = 0;
        do {
            System.out.println("\nMemoria disponible: " + (MAX_REGISTROS - registros) + " registros.");
            System.out.println("1: Registrar municipio.");
            System.out.println("2: Ver lista de municipios.");
            System.out.println("3: Ver información municipio.");
            System.out.println("4: Registrar número de habitantes de un municipio.");
            System.out.println("5: Registrar altura sobre el nivel del mar de un municipio.");
            System.out.println("6: Ver lista de departamentos registrados.");
            System.out.println("7: Ver información de departamento.");
            System.out.println("8: Eliminar municipio.");
            System.out.println("9: Eliminar departamento.");
            System.out.println("10. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); 

            if(opcion ==1){
                registrarMunicipio(scanner);
                break;

            }else if(opcion ==2){
                verListaMunicipios();
                break;

            }else if(opcion ==3){
                verInformacionMunicipio(scanner);
                break;

            }else if(opcion ==4){
                registrarHabitantesMunicipio(scanner);
                break;

            }else if(opcion ==5){
                registrarAlturaMunicipio(scanner);
                break;

            }else if(opcion ==6){
                verListaDepartamentos();
                break;

            }else if(opcion ==7){
                verInformacionDepartamento(scanner);
                break;

            }else if(opcion ==8){
                eliminarMunicipio(scanner);
                break;

            }else if(opcion ==9){
                eliminarDepartamento(scanner);
                break;

            }else if(opcion ==10){
                System.out.println("");
                break;

            }
        } while (opcion != 10);

        if (registros >= MAX_REGISTROS) {
            System.out.println("¡No hay más espacio para registros!");
            return;
        }
        System.out.print("Ingrese el nombre del municipio: ");
        String municipio = scanner.nextLine();
        System.out.print("Ingrese el nombre del departamento: ");
        String departamento = scanner.nextLine();
        if (buscarMunicipio(municipio, departamento) != -1) {
            System.out.println("El municipio ya existe en ese departamento.");
            return;
        }
        departamentos[registros] = departamento;
        municipios[registros] = municipio;
        registros++;
        System.out.println("Municipio registrado exitosamente.");

         if (registros == 0) {
            System.out.println("No hay municipios registrados.");
            return;
        }
        System.out.println("Lista de municipios:");
        for (int i = 0; i < registros; i++) {
            System.out.println((i + 1));
        }    

       

       
    }


}