/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E40_I_Cliente implements E40_I_imprimiendo{
    private String nombre;
    private String direccion;
    private String fechaRegistro;
    private int edad;
    //constructor comun
    public E40_I_Cliente(String nombre, String direccion, String fechaRegistro, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaRegistro = fechaRegistro;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //metodos definidos en la interfaz 
    @Override
    public String imprimir() {
        return "Del cliente "+getNombre()+" su dirección es : "+getDireccion();
    }

    @Override
    public String mostrarFechaRegistro() {
       return "Del cliente "+this.nombre+" su fecha de registro es : "+this.fechaRegistro;
    }

    @Override
    public int mostrarEdad() {
      return this.edad;
    }
    
}
