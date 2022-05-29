/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E39_I_BarcoPortaAviones implements E39_I_Barco{

    public E39_I_BarcoPortaAviones() {
        System.out.println("Se ha creado el objeto Barco Porta Aviones!!!");
    }
    
    @Override
    public void alarma() {
        System.out.println("Alarma del barco Porta Aviones");
    }

    @Override
    public void msgsocorro(String v) {
        System.out.println("SOS SOS SOS "+v);
    }
    
}
