
package EjerciciosLenguajeII_1400;

//sobreescritura de metodos POlimorfismo Clase Base
public abstract class E45_PolimorfismoSobreescritura_Empleados {
    public abstract void sueldo(double horasT, double pagoH);
    public abstract void nombre(String nombre, String apellido);
    public abstract void funciones(String funciones);
    public void saludo(){
        System.out.println("Hola");
    }
}
