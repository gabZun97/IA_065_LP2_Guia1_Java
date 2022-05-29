/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;


public class E44_PolimorfismoSobrecarga_MainSobrecarga {
    public static void main(String[] args) {
        //E44_PolimorfismoSobrecarga_Empleados emp = new  E44_PolimorfismoSobrecarga_Empleados();
        E44_PolimorfismoSobrecarga_JefeInformatica ji = new E44_PolimorfismoSobrecarga_JefeInformatica();
        
        ji.nombre("Juan", "Lopez", "123456", "Tegucigalpa");
        ji.sueldo(12, 10, 100);
        ji.funciones("Encargado del depto de TI", "24 hrs");
    }
}
