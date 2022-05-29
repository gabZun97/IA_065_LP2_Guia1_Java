/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E39_I_PruebaInterface {
    public static void main(String[] args) {        
        E39_I_BarcoPasajeros bp = new E39_I_BarcoPasajeros();
        E39_I_BarcoPortaAviones bpa = new E39_I_BarcoPortaAviones();
        
        bp.msgsocorro("Empiecen a rezar!!!");
        bpa.msgsocorro("Atentos marinos!!!");
    }
}
