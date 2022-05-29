/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

import java.util.HashSet;

public class E35_collection_hashset {
     public static void main(String args[]) {
      // Declaracion de HashSet 
      HashSet<String> hset = new HashSet<String>();

      // Agregando elementos al hashset   
      hset.add("Uvas");
      hset.add("Manzanas");
      hset.add("Peras");
      hset.add("Mangos");
      hset.add("Duraznos");

       //Mostrando los valores del hashset
      System.out.println(hset);
         System.out.println("===============================");
      //agregando elementos duplicados 
      hset.add("Manzanas");
      hset.add("Peras");
      //Mostrando los valores del hashset
      System.out.println(hset);
         System.out.println("===============================");
      //Agregando valores nulos
      hset.add(null);
      hset.add(null);
      hset.add("Sandias");
      hset.remove("Manzanas");

      //Mostrando los valores del hashset
      System.out.println(hset);
    }
}
