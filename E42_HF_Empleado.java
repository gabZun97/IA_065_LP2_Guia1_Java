
package EjerciciosLenguajeII_1400;


public class E42_HF_Empleado extends E42_HF_Persona{
    private String tipoContrato; //contrato o permanente
    private double sueldo;

    public E42_HF_Empleado(String tipoContrato, double sueldo) {
        super();
        this.tipoContrato = tipoContrato;
        this.sueldo = sueldo;
    }

    public E42_HF_Empleado() {
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //metodo miembro 
    //definiendo un sueldo por cada tipo de contrato que tenga en empleado
    public void calcularSueldo(double sueldoBase){
        if(this.getTipoContrato()=="Contrato"){
            this.setSueldo(sueldoBase + 4000);
        }else if(this.getTipoContrato()=="Permanente"){
            this.setSueldo(sueldoBase + 5000);
        }
    }
    
}
