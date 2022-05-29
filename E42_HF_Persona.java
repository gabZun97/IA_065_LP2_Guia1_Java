
package EjerciciosLenguajeII_1400;

public class E42_HF_Persona {
    private String nombres;
    private String apellidos;
    private String dni;
    private String tipo; //cliente o empleado

    public E42_HF_Persona(String nombres, String apellidos, String dni, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tipo = tipo;
    }
    public E42_HF_Persona(){
        
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
