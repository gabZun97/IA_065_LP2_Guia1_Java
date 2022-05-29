/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

import javax.swing.JOptionPane;

public class E44_PolimorfismoSobrecarga_JefeBodega extends E44_PolimorfismoSobrecarga_Empleados{
    public void sueldo(double horasT, double pagoH){  
        JOptionPane.showMessageDialog(null, "El sueldo del Jefe de RRHH es: Lps."+(horasT*pagoH));
    }
    public void nombre(String nombre){   
        JOptionPane.showMessageDialog(null, "Nombre del Jefe de RRHH: "+nombre);
    }
    public void funciones(String horario){ 
        JOptionPane.showMessageDialog(null, "Horario Laboral del Jefe de RRHH: \n"+horario);
    }
}
