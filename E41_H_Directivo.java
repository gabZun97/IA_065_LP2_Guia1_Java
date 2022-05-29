
package EjerciciosLenguajeII_1400;


public class E41_H_Directivo extends E41_H_Empleado{

    public E41_H_Directivo() {
    }

    public E41_H_Directivo(String nombre) {
        super(nombre);
        System.out.println("--Constructor de Directivo--");
    }
    @Override
    public String nombre(){
        return super.getNombre()+" -> Directivo";
    }
    
}
