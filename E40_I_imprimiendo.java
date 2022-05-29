/*
 * Crearemos un objeto administrador, cliente, imprimir (crear un constructor de copia y metodo 
    que me permita imprimir un objeto), que utilizaran la interfaz I_imprimiendo donde declararemos 
    varios metodos por ejemplo: metodo imprimir, fecha de registro, edad.
 */
package EjerciciosLenguajeII_1400;

public interface E40_I_imprimiendo {
    public abstract String imprimir();
    String mostrarFechaRegistro();
    int mostrarEdad();
}
