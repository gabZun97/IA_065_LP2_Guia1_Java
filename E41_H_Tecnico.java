
package EjerciciosLenguajeII_1400;

public class E41_H_Tecnico extends E41_H_Operario{

    public E41_H_Tecnico(String nombre) {
        super(nombre);
        System.out.println("--Constructor de Técnico--");
    }

    public E41_H_Tecnico() {
    }
    
    @Override
    public String nombre(){
        return super.nombre()+" -> Técnico";
    }
}
