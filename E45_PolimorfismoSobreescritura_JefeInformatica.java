
package EjerciciosLenguajeII_1400;

import javax.swing.JOptionPane;

public class E45_PolimorfismoSobreescritura_JefeInformatica extends E45_PolimorfismoSobreescritura_Empleados {

    @Override
    public void sueldo(double horasT, double pagoH) {
        JOptionPane.showMessageDialog(null, "El sueldo del Jefe de Informatica es: Lps."+(horasT*pagoH));
    }

    @Override
    public void funciones(String funciones) {
        JOptionPane.showMessageDialog(null, "Funciones del Jefe de Informatica: \n"+funciones);
    }
    
    @Override
    public void nombre(String nombre, String apellido) {
        JOptionPane.showMessageDialog(null, "Nombre del Jefe de Informatica: "+nombre+"\nApellido: "+apellido);
    }
}
