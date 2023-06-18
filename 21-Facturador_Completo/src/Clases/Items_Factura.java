package Clases;

public class Items_Factura {
    
    private int cedulaCliente;
    private int cedulaVendedor;
    private int total;
    private int id_factura;

    public Items_Factura(int cedulaCliente, int cedulaVendedor, int total, int id_factura) {
        this.cedulaCliente = cedulaCliente;
        this.cedulaVendedor = cedulaVendedor;
        this.total = total;
        this.id_factura = id_factura;
    }

    public int getcedulaCliente() {
        return cedulaCliente;
    }

    public void setcedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getcedulaVendedor() {
        return cedulaVendedor;
    }

    public void setcedulaVendedor(int cedulaVendedor) {
        this.cedulaVendedor = cedulaVendedor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    
    
    
}