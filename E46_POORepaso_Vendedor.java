
package EjerciciosLenguajeII_1400;

public class E46_POORepaso_Vendedor extends E46_POORepaso_Sucursal{
    private String nombreVendedor;
    private double[] ventas;
    public static final String[] mes = {
        "Enero",
        "Febrero",
        "Marzo",
        "Abril",
        "Mayo",
        "Junio",
        "Julio",
        "Agosto",
        "Septiembre",
        "Octubre",
        "Noviembre",
        "Diciembre"
    };
    private double bono;
    
    //constructores
    public E46_POORepaso_Vendedor() {
        ventas = new double[12];
        for(int i=0; i<ventas.length; i++){
            ventas[i] = 0.0;
        }
    }

    public E46_POORepaso_Vendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public E46_POORepaso_Vendedor(String nombreVendedor, double[] ventas) {
        this.nombreVendedor = nombreVendedor;
        this.ventas = ventas;
    }
    
    //get

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public double getBono() {
        return bono;
    }
    //set

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void setVentas(int mes, double ventaMes) {
        ventas[mes] = ventaMes;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    
    public double getVentas(){
        double total = 0.0;
        for(double v: ventas){
            total += v;
        }
        return total;
    }
    
    public void calcularBono(){
        double total = 0.0;
        for(double v: ventas){
            total += v;
        }
        this.bono = (total*0.08);
    }
    
    
}
