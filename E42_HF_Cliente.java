
package EjerciciosLenguajeII_1400;

public class E42_HF_Cliente extends E42_HF_Persona{
    private String categoria; //frecuente... 
    private String codigo;
    
    
    public E42_HF_Cliente(String categoria, String codigo) {
        super();
        this.categoria = categoria;
        this.codigo = codigo;
    }

    public E42_HF_Cliente() {
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
