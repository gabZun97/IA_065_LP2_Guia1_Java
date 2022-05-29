
package EjerciciosLenguajeII_1400;

public class E46_POORepaso_Tienda {
    private String nombreTienda;
    private String direccionTienda;
    private String rtnTienda;
    private double ventasTotalesTienda;
    
    //constructores
    public E46_POORepaso_Tienda() {
    }  

    public E46_POORepaso_Tienda(String nombreTienda, String direccionTienda, String rtnTienda, double ventasTotalesTienda) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.rtnTienda = rtnTienda;
        this.ventasTotalesTienda = ventasTotalesTienda;
    }
    
    //metodos get

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public String getRtnTienda() {
        return rtnTienda;
    }

    public double getVentasTotalesTienda() {
        return ventasTotalesTienda;
    }
    
    // Metodos set

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public void setRtnTienda(String rtnTienda) {
        this.rtnTienda = rtnTienda;
    }

    public void setVentasTotalesTienda(double ventasTotalesTienda) {
        this.ventasTotalesTienda = ventasTotalesTienda;
    }
    
    
    //metodos propios 
    public void ventasTotales(double ventasSucursal1, double ventasSucursal2){
        this.ventasTotalesTienda = (ventasSucursal1+ventasSucursal2);
    }
}
