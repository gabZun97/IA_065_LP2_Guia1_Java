/*
 * Utilizando una clase abstracta (operaciones) definir suma como metodo abstracto y 
 * resta como metodo no abstracto, heredar la clase abstracta y ejemplificar 
 */
package EjerciciosLenguajeII_1400;

public abstract class E43_ClaseAbstracta_Operaciones {
    //metodo abstracto (solo define)
    public abstract int suma(int a, int b);
    //metodo que no es abstracto y podemos construirlo completamente
    public int resta(int a, int b){
        return (a-b);
    }
}
