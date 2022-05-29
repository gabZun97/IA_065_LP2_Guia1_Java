
package EjerciciosLenguajeII_1400;

public class E41_H_Oficial extends E41_H_Operario{

    public E41_H_Oficial() {
    }

    public E41_H_Oficial(String nombre) {
        super(nombre);
        System.out.println("--Constructor de Oficial--");
    }
    
    @Override
    public String nombre(){
        return super.nombre()+" -> Oficial";
    }
    
}
