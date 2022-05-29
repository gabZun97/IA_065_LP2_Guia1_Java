/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E40_I_Principal {
    public static void main(String[] args) {
        E40_I_Cliente cliente = new E40_I_Cliente("Maria Galo","Tegucigalpa","23/03/2022",24);
        E40_I_Administrador admin = new E40_I_Administrador("mgalo","12345","22/03/2022",21);
        E40_I_Imprimir pantalla = new E40_I_Imprimir(cliente);
        
        pantalla.imprimirObjeto();
    }
}
