/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;
import javax.swing.JOptionPane; //mensajes de dialogo
public class E45_PolimorfismoSobreescritura_JefeRRHH extends E45_PolimorfismoSobreescritura_Empleados {

    @Override
    public void sueldo(double horasT, double pagoH) {
        JOptionPane.showMessageDialog(null, "El sueldo del Jefe de RRHH es: Lps."+(horasT*pagoH));
    }

    @Override
    public void nombre(String nombre, String apellido) {
        JOptionPane.showMessageDialog(null, "Nombre del Jefe de RRHH: "+nombre+"\nApellido: "+apellido);
    }

    @Override
    public void funciones(String funciones) {
        JOptionPane.showMessageDialog(null, "Funciones del Jefe de RRHH: \n"+funciones);
    }   
}
