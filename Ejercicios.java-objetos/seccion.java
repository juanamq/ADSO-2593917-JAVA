import java.util.Scanner;

public class Seccion{
  public static void main(String [] args){

    Scanner entrada_numero = new Scanner (System.in);
    Scanner entrada_texto = new Scanner (System.in);
                                                                                                    
    int opcion = 0;
    int pos_disponible  = 0;
    Seccion1 arreglo [] = new Seccion1 [100];

    do{
      System.out.println("||----------------------------------------------||");
      System.out.println("||---------------SECCION CLIENTES---------------||");
      System.out.println("||----------------------------------------------||");
      System.out.println("||                         Personas Regitardas:"+((pos_disponible<10)?"0":"")+pos_disponible+"-||");
      System.out.println("|| 1.Registrar Persona.                         ||");
      System.out.println("|| 2.Ver clientes Registrados.                  ||");
      System.out.println("|| 3.Modificar Infomacion Cliente.              ||");
      System.out.println("|| 4.Ver informacion Cliente.                   ||");
      System.out.println("|| 5.Eliminar Cliente.                          ||");
      System.out.println("|| 6.Salir.                                     ||");
      System.out.println("||----------------------------------------------||");
      opcion = entrada_numero.nextInt();

      if ( opcion == 1 ){

        System.out.print("=> Ingrese el documento: ");
        int documento = entrada_numero.nextInt();

        System.out.print("=> Ingrese nombres: ");
        String nombres = entrada_texto.nextLine();

        System.out.print("=> Ingrese apellidos: ");
        String apellidos = entrada_texto.nextLine();

        System.out.print("=> Ingrese la direccion: ");
        String direccion = entrada_texto.nextLine();

        System.out.print("=> Ingrese el telefono: ");
        String telefono = entrada_texto.nextLine();

        System.out.print("=> Ingrese su email: ");
        String email = entrada_texto.nextLine();

        Seccion1 temporal = new Seccion1(documento,nombres,apellidos,direccion,telefono,email);
        boolean valido  = true;
        for(int i = 0; i < pos_disponible; i++){
          if (temporal.getDocumento() == arreglo[i].getDocumento()){
            valido = false;
            break;
          }

        }
        if(valido){
          arreglo[pos_disponible] = temporal;
          pos_disponible++;
          System.out.println("===> REGISTRADO CON EXITO \n\n");

        }else{
          System.out.println("===> EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTTRAR \n\n");
        }
        arreglo[pos_disponible]  = temporal;
        pos_disponible++; 

      }else if (opcion == 2){
        System.out.println("===> CLIENTES REGISTRADOS:");

         for(int i = 0; i < arreglo.length; i++){
           if (arreglo[i] !=null){
            arreglo[i].mostrarResumenDatos();
           }

          }
        System.out.println("\n\n");

      }else if(opcion == 3){
        Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el documento del cliente a modificar:");
    String documento = entrada.nextLine();

    int clienteIndex = buscarCliente(documento);

    if (clienteIndex == -1) {
      System.out.println("No se encontró ningún cliente con ese documento.");
      return;
    }

    Cliente cliente = clientes[clienteIndex];

    while (true) {
      System.out.println("|| ---------------------------------------------||");
      System.out.println("|| ------- MODIFICAR INFORMACION CLIENTE -------||");
      System.out.println("|| ---------------------------------------------||");
      System.out.println("|| 1. Modificar nombres.                        ||");
      System.out.println("|| 2. Modificar apellidos.                      ||");
      System.out.println("|| 3. Salir.                                    ||");
      System.out.println("|| ---------------------------------------------||");

      System.out.print("Ingrese su opción: ");
      int opcion = sc.nextInt();

         if (opcion == 1) {
           entrada.nextLine(); 

           System.out.print("Ingrese los nuevos nombres: ");
           String nombres = sc.nextLine();

           cliente.setNombres(nombres);

           System.out.println("Los nombres del cliente han sido actualizados exitosamente.");
         } else if (opcion == 2) {
           sc.nextLine();

           System.out.print("Ingrese los nuevos apellidos: ");
           String apellidos = sc.nextLine
          }else if(opcion == 3){
            System.out.println("");
          }
          


      }else if(opcion == 4){
        for(int i = 0; i < arreglo.length; i++){
          if (arreglo[i] !=null){
            arreglo[i].mostrarDatosPersonales();
          }

        }
        System.out.println("\n\n");


      }else if (opcion == 5){
        Scanner eliminar_persona = new Scanner(System.in);

    System.out.println("Ingrese el documento del cliente a eliminar:");
    String documento = eliminar_persona.nextLine();

    int clienteIndex = buscarCliente(documento);

    if (clienteIndex == -1) {
      System.out.println("No se encontró ningún cliente con ese documento.");
      return;
    }

    Cliente cliente = clientes[clienteIndex];

    
    for (int i = clienteIndex; i < contador - 1; i++) {
      clientes[i] = clientes[i + 1];
    }

    clientes[contador - 1] = null;
    contador--;

    System.out.println("El cliente ha sido eliminado exitosamente.");
  }

  int buscarCliente(String documento) {
    for (int i = 0; i < contador; i++) {
      Cliente cliente = clientes[i];

      if (cliente.getDocumento().equals(documento)) {
        return i;
      }
    }

    return -1;
  }
    }
    

    }while(opcion != 6);
    

  }

}