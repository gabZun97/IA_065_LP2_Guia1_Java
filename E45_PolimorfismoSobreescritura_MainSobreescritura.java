/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E45_PolimorfismoSobreescritura_MainSobreescritura {
    public static void main(String[] args) {
        
       E45_PolimorfismoSobreescritura_JefeInformatica ji = new E45_PolimorfismoSobreescritura_JefeInformatica();
        
       ji.nombre("Karla", "Alvarado");
       ji.sueldo(25, 150);
       ji.funciones("Encargado del Departamento de TIC");
        //ji.sueldo(12, 10, 100);
        //ji.funciones("Encargado del depto de TI", "24 hrs");
    }
}
