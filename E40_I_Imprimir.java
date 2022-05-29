/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E40_I_Imprimir {
    private E40_I_imprimiendo objeto; //objeto a imprimir de tipo interfaz
    
    //constructor de copia 
    public E40_I_Imprimir(E40_I_imprimiendo obj){ //constructor de copia parametro que recibe de tipo interfaz
        this.objeto = obj;
    }
    public void imprimirObjeto(){ //metodo para mostrar objeto en pantalla 
        System.out.println(this.objeto.imprimir());//estamos pasando el objeto 
        //(de tipo interfaz) y llamamos al metodo imprimir 
        System.out.println(this.objeto.mostrarFechaRegistro());
        System.out.println("La edad es: "+this.objeto.mostrarEdad()+" años");
    }
}
