public class Principal{
  public static void main(String [] args){
    // Instancia de la clase persona

    //Persona mauricio  = new Persona();
    //Persona alberth = new Persona(108800,"jhon Alberth","Aricapa Pinto","Masculino",17,50000,165);
    //Persona monsalve = new Persona(108801,"juan David","Monsalve");

    //System.out.println(" => Cedula Mauricio:"+mauricio.cedula);

    //mauricio.imprimirCartaPresentacion();
    //alberth.imprimirCartaPresentacion();
    //monsalve.imprimirCartaPresentacion();

    //alberth.comer(850);
    //alberth.imprimirCartaPresentacion();

    Persona lista [] = new Persona[10];

    lista[0] = new Persona();
    lista[1] = new Persona(108800,"jhon Alberth","Aricapa Pinto","Masculino",17,50000,165);
    lista[2] = new Persona(108801,"juan David","Monsalve");

    lista[0].imprimirCartaPresentacion();
    lista[1].imprimirCartaPresentacion();
    lista[2].imprimirCartaPresentacion();
    lista[3].imprimirCartaPresentacion();
    


    

    

  }

}