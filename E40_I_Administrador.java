/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E40_I_Administrador implements E40_I_imprimiendo{
    private String usuario;
    private String clave;
    private String fechaRegistro;
    private int edad;

    public E40_I_Administrador(String usuario, String clave, String fechaRegistro, int edad) {
        this.usuario = usuario;
        this.clave = clave;
        this.fechaRegistro = fechaRegistro;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public int getEdad() {
        return edad;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String imprimir() {
        return "Del usuario "+getUsuario()+" su clave es : "+getClave();
    }

    @Override
    public String mostrarFechaRegistro() {
        return "Del usuario "+getUsuario()+" su fecha de registro es : "+getFechaRegistro();        
    }

    @Override
    public int mostrarEdad() {
        return getEdad();
    }
    
}
