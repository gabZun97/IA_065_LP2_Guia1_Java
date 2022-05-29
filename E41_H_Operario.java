/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E41_H_Operario extends E41_H_Empleado{
    //constructor comun
    public E41_H_Operario(String nombre){
        super(nombre); //llamando al constructor de mi clase padre y le paso valores
        System.out.println("--Constructor de Operario--");
    }

    public E41_H_Operario() {
    }
    
    @Override
    public String nombre(){
        return super.nombre() + " -> Operario"; //accediendo al nombre del empleado y concateno con la cadena operario
    }
    
}
