/*
 * POO - Interpretando como objeto un estudiante
 */
package EjerciciosLenguajeII_1400;

public class E38_POO_Estudiante {
    //atributos, cualidades o caracteristicas
    private String nombre;
    private String nCuenta;
    private String carrera;
    private int nClases;
    private double promedio;
    //definir el constructor
    //constructor por defecto
    public E38_POO_Estudiante(){
        
    }
    //constructor comun
    public E38_POO_Estudiante(String nombre, String nCuenta, String carrera, int nClases, double promedio){
        this.nombre = nombre;  //pasando valores a mis atributos
        this.nCuenta = nCuenta;
        this.carrera = carrera;
        this.nClases = nClases;
        this.promedio = promedio;
    }
    //constructor de copia 
    public E38_POO_Estudiante(E38_POO_Estudiante e){
        this.nombre = e.nombre;
        this.carrera = e.carrera;        
    }
    
    //nombre
    //get: para retornar el valor almacenado en cada atributo 
    public String getNombre(){
        return nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getnClases() {
        return nClases;
    }

    public double getPromedio() {
        return promedio;
    }
    
    //set: para asignar un valor a cada atributo del objeto
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setnClases(int nClases) {
        this.nClases = nClases;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    //tambien es parte del comportamiento del objeto 
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Cuenta: "+getnCuenta());
        System.out.println("Carrera: "+getCarrera());
        System.out.println("Numero de clases: "+getnClases());
        System.out.println("Promedio: "+getPromedio());
    }
    public void saludo(){
        System.out.println("Bienvenido a la POO");        
    }
    
    @Override //anulación
    protected void finalize() throws Throwable{ //excepción para lanzar todo tipo de errores en java 
        System.out.println("Se ha llamado al metodo finalizar con recolector de basura");        
    }
    
}
