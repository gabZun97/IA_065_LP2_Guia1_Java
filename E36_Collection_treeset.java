/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

import java.util.Set;
import java.util.TreeSet;

public class E36_collection_treeset {
    public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<String>();
    ts.add("Tegucigalpa");
    ts.add("SPS");
    ts.add("Choluteca");
    
    System.out.println("Elementos en el treeset despues de la operacion agregar:" + ts);
    
    TreeSet<String> t = new TreeSet<String>();
    t.add("Catacamas");
    t.add("La Esperanza");
    t.add("La Esperanza");
    ts.addAll(t);
    
    System.out.println("Elementos en el treeset despues de la operacion agregar todos: " + ts);
    
    
    Set<Integer> conjunto = new TreeSet<Integer>();
    while (conjunto.size() < 10) {
        int aleatorio = (int) (Math.random() * 100) + 1;
        conjunto.add(aleatorio);
    }
    System.out.println(conjunto);
  }
}
