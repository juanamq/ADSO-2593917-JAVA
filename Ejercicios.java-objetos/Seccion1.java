public class Seccion1{
    // Atributos
  private int documento;
  private String nombres;
  private String apellidos;
  private String direccion ;
  private String telefono;
  private String email;

    // Metodos
   
    public Seccion1(int documento, String nombres, String apellidos,String telefono,String direccion,String email){
      this.documento = documento;
      this.nombres = nombres;
      this.apellidos =  apellidos;  
      this.direccion = direccion;
      this.telefono  = telefono;
      this.email = email;

    }

    public int getDocumento() {
      return this.documento;
    }

    public void setDocumento(int documento ) {
      this.documento = documento;
    }

    public String getNombres() {
      return this.nombres;
    }

    public void setNombres(String nombres) {
      this.nombres = nombres;
    }

    public String getApellidos() {
      return this.apellidos;
    }

    public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
    }

    public String getDireccion() {
      return this.direccion;
    }

    public void setDireccion(String direccion) {
      this.direccion = direccion;
    }

    public String getTelefono() {
      return this.telefono;
    }

    public void setTelefono(String  telefono) {
      this.telefono = telefono;
    }
    public String getEmail() {
      return this.email;
    }

    public void setEmail(String email) {
      this.email = email;
    }
    
    
    public void mostrarDatosPersonales(){
      System.out.println("-------------------------------");
      System.out.println("--DATOS PERSONA              --");
      System.out.println("-------------------------------");
      System.out.println("| Documento:"+this.documento);
      System.out.println("| Nombres:"+this.nombres);
      System.out.println("| Apellidos:"+this.apellidos);
      System.out.println("| Dirrecion:"+this.direccion);
      System.out.println("| Telefono:"+this.telefono);
      System.out.println("| Email:"+this.email);
      System.out.println("--------------------------------");
      
    }
     public void mostrarResumenDatos(){
      System.out.println("     "+this.documento+" - "+this.nombres+" "+this.apellidos);
     
    }

}