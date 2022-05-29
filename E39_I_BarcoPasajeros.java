/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E39_I_BarcoPasajeros implements E39_I_Barco{

    public E39_I_BarcoPasajeros() {
        System.out.println("Creamos el objeto Barco de Pasajeros");
    }    
    
    @Override
    public void alarma() {
        System.out.println("Alarma del barco de pasajeros");
    }
    @Override
    public void msgsocorro(String v) {
        alarma();
        System.out.println("SOS SOS "+v);
    }
    
}
