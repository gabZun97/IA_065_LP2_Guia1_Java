
package EjerciciosLenguajeII_1400;

public class E46_POORepaso_Sucursal extends E46_POORepaso_Tienda{
    private String nombreSucursal;
    private double ventasSucursal;

    public E46_POORepaso_Sucursal() {
    }
    public E46_POORepaso_Sucursal(String nombreTienda, String direccionTienda, String rtnTienda, double ventasTotalesTienda, String nombreSucursal, double ventasSucursal) {
        super(nombreTienda, direccionTienda, rtnTienda, ventasTotalesTienda);
        this.nombreSucursal = nombreSucursal;
        this.ventasSucursal = ventasSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public double getVentasSucursal() {
        return ventasSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public void setVentasSucursal(double ventasSucursal) {
        this.ventasSucursal = ventasSucursal;
    }
    
    //metodos sobrecargado 
    public void ventasTotales(double ventasVendedor1, double ventasVendedor2){
        this.ventasSucursal = (ventasVendedor1+ventasVendedor2);
    }
    
    
    
}
