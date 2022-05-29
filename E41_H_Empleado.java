/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E41_H_Empleado {
    private String nombre;

    public E41_H_Empleado() {
    }

    public E41_H_Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("--Constructor de Empleado--");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodo miembro
    public String nombre(){
        return "Empleado: "+getNombre();
    }
}
