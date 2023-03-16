import java.util.Scanner;

public class Ejercicio1{
  public static void main(String [] args){


    Scanner entrada_numero = new Scanner (System.in);
    Scanner entrada_texto = new Scanner (System.in);

    int opcion = 0;
    int pos_disponible  = 0;
    Personas arreglo [] = new Personas [100];

    do{

      System.out.println("||--------------------------------------||");
      System.out.println("||---------------PERSONAS---------------||");
      System.out.println("||--------------------------------------||");
      System.out.println("||                 Personas Regitardas:"+((pos_disponible<10)?"0":"")+pos_disponible+"-||");
      System.out.println("|| 1.Registrar Persona.                 ||");
      System.out.println("|| 2.Ver lista de Personas.             ||");
      System.out.println("|| 3.Ordenar lista Personas.            ||");
      System.out.println("|| 4.Salir.                             ||");
      System.out.println("||--------------------------------------||");
      System.out.println("=> Ingrese una opcion:");
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

        Personas temporal = new Personas(documento,nombres,apellidos,direccion,telefono,email);
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

        for(int i = 0; i < arreglo.length; i++){
          if (arreglo[i] !=null){
            arreglo[i].mostrarResumenDatos();
          }

        }
        System.out.println("\n\n");

      }else if(opcion == 3){
        for(int i = 0; i < arreglo.length; i++){
          for(int j = 0; j < arreglo.length; j++){
          if (arreglo[j] !=null && arreglo[j+1] !=null){
            if(arreglo[j].getNombres().compareToIgnoreCase(arreglo[j+1].getNombres())> 0){
              Personas aux = arreglo[j];
              arreglo[j]=arreglo[j+1];
              arreglo[j+1]  = aux;
            }
          }

        }

        }


      }else if (opcion == 4){
      System.out.println("||--------------------------------------||");
      System.out.println("||============== SALIENDO ==============||");

    }else{
      System.out.println("||--------------------------------------||");
      System.out.println("||========== OPCION INVALIDA ===========||");
      System.out.println("||--------------------------------------||");
    }

    }while(opcion!=4);

    
    
    



    


    

    

  }

}