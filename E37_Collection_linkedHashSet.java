/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

import java.util.LinkedHashSet;
import java.util.Set;

public class E37_collection_linkedHashSet {
    public static void main(String[] args) {
        Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
        conjunto3.add(20);
        conjunto3.add(10);
        conjunto3.add(1);
        conjunto3.add(5);
        conjunto3.add(11);
        conjunto3.add(25);
        conjunto3.add(13);
        conjunto3.add(58);
        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
        conjunto3.add(20);
        // Los elementos se muestran en el orden que se insertaron
        for (int elemento : conjunto3){
            System.out.print(elemento + " - ");
        }            
        System.out.println();
    }
}
