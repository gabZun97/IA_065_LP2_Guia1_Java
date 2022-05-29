/*Clase que contiene el/los metodos observe que la clase no requiere un main*/
package EjerciciosLenguajeII_1400;

public class E16_MetodoClaseFactorial1 {
    long factorial(int numero){
        long f = 1;
        for(int i = 2; i <= numero; i++){
            f *= i;
        }
        return f;
    }
}
