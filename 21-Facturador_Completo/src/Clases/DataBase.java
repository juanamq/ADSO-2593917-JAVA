package Clases;

import java.sql.*;

public class DataBase {
    
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "almacenes";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
    
    public Persona[] listaClientes(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona[] listaVendedores(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Persona buscarVendedor(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    public Persona eliminarCliente(String cedula){
        boolean Persona  = false;
        
    try {
        ResultSet registros = this.manipularDB.executeQuery("DELETE FROM clientes WHERE cedula='"+cedula+"' ");
        registros.next();
        if (registros.getRow()==1) {
            Persona= true;
            
        }
    } catch (SQLException ex) {
        System.out.println("--> Error Delete: " + ex.getMessage());
    }
    if(Persona){
        System.out.println("Datos Eliminados con exito");
    }else{
        System.out.println("No se pudo Eliminar");
    }
        return null;
        
    }
    
    
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE vendedores SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean insertarVendedor(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO vendedores(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean insertarFactura(String id, String cedula_cliente, String cedula_vendedor, String fecha, int total){
        String consulta = "INSERT INTO facturas(id, cedula_cliente, cedula_vendedor, fecha, total ) VALUES ('"+id+"','"+cedula_cliente+"','"+cedula_vendedor+"', '"+fecha+"', '"+total+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
     
     public boolean insertarItemsFactura(FacturaProducto producto[]){
          
        try{
            for(int i=0;i<producto.length;i++){
                
                if(producto[i]!=null){
                    FacturaProducto listaF = producto[i];
                    String id_factura=listaF.getFactura_producto();
                    String id_producto=listaF.getId_producto();
                    int cant=listaF.getCant();
                    int sub=listaF.getSubtotal();
                     String consulta = "INSERT INTO items_factura(id_factura, id_producto, cantidad, subtotal ) VALUES ('"+id_factura+"','"+id_producto+"', '"+cant+"', '"+sub+"') "; 
                     int respuesta=manipularDB.executeUpdate(consulta);
                }else{
                    break;
                }
            }
            
            
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
        return false;
    }
     
     public String extraerId(){
         try {
             ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM facturas ORDER BY id DESC");
             registros.next();
            if(registros.getRow()==1){
                return String.valueOf(registros.getInt("id")+1);
            }
         } catch (SQLException e) {
             System.out.print("error: "+e.getMessage());
         }
         return null;
     }
    
    public boolean eliminarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();

        try {
            String consulta = "DELETE FROM clientes WHERE cedula=' "+cedula+" ' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta>0) {
                respuesta = true;
            }
        }catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean eliminarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();

        try {
            String consulta = "DELETE FROM vendedores WHERE cedula=' "+cedula+" ' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta>0) {
                respuesta = true;
            }
        }catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean eliminarProducto(Producto producto){
        boolean respuesta = false;
        int id = producto.getId();
        String nombre = producto.getNombre();
        int precio = producto.getPrecio();


        try {
            String consulta = "DELETE FROM productos WHERE id=' "+id+" ' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta>0) {
                respuesta = true;
            }
        }catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
         
    }
         
    public boolean insertarProducto(Producto producto){
        int id = producto.getId();
        String nombre = producto.getNombre();
        int precio = producto.getPrecio();


        String consulta = "INSERT INTO productos(id, nombre, precio) VALUES (' "+id+" ', ' "+nombre+" ', ' "+precio+" ') ";    

        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("PRODUCTO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            System.out.println("consulta:" + consulta);
            return false;
        }
    }

    public Factura_Productos[] buscarProductos_Factura(String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Factura[] listar_Factura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
         
         
}
    
    

