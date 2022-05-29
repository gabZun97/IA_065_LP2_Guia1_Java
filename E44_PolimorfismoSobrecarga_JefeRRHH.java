/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;
import javax.swing.JOptionPane; //mensajes de dialogo
public class E44_PolimorfismoSobrecarga_JefeRRHH extends E44_PolimorfismoSobrecarga_Empleados {
    public void sueldo(double horasT, double pagoH){  
        JOptionPane.showMessageDialog(null, "El sueldo del Jefe de RRHH es: Lps."+(horasT*pagoH));
    }
    public void nombre(String nombre, String apellido){   
        JOptionPane.showMessageDialog(null, "Nombre del Jefe de RRHH: "+nombre+"\nApellido: "+apellido);
    }
    public void funciones(String funciones){ 
        JOptionPane.showMessageDialog(null, "Funciones del Jefe de RRHH: \n"+funciones);
    }
}
