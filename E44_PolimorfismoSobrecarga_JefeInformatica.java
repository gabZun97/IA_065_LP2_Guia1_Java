
package EjerciciosLenguajeII_1400;

import javax.swing.JOptionPane;

public class E44_PolimorfismoSobrecarga_JefeInformatica extends E44_PolimorfismoSobrecarga_Empleados{
    public void sueldo(double horasT, double pagoH, double bono){  
        JOptionPane.showMessageDialog(null, "El sueldo del Jefe de Informatica es: Lps."+((horasT*pagoH)+bono));
    }
    public void nombre(String nombre, String apellido, String tel, String dir){   
        JOptionPane.showMessageDialog(null, "Nombre del Jefe de Informatica: "+nombre+"\nApellido: "+apellido+"\nTelefono: "+tel+"\nDireccion: "+dir);
    }
    public void funciones(String funciones, String Horario){ 
        JOptionPane.showMessageDialog(null, "Funciones del Jefe de Informatica: \n"+funciones+"\nHorario Laboral: "+Horario);
    }
}
