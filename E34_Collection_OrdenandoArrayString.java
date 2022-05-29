/*
 * Ordenando Array de string y List usando sort
 */
package EjerciciosLenguajeII_1400;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class E34_Collection_OrdenandoArrayString {
    public static void main(String[] args) {
        String cadena = "BCDAZ"; 
        char [] arrayCaracteres = cadena.toCharArray(); //convirtiendo la cadena en un array de caracteres
        Arrays.sort(arrayCaracteres); //ordenando el arreglo de caracteres de acuerdo a el orden natural de los elementos
        String stringOrdenado = new String(arrayCaracteres); //convirtiendolo nuevamente a una cadena de caracteres 
        System.out.println("La cadena desordenada es : " + cadena); 
        System.out.println("La cadena ordenada es : " + stringOrdenado);  
        
        
        
        List nombres = new LinkedList<>();
        // Agregamos los nombres.
        nombres.add("Aries");
        nombres.add("Tauro");
        nombres.add("Geminis");
        nombres.add("Cancer");
        nombres.add("Leo");
        nombres.add("Virgo");
        nombres.add("Libra");
        nombres.add("Escorpio");
        nombres.add("Sagitario");
        nombres.add("Capricornio");
        nombres.add("Acuario");
        nombres.add("Piscis");
         
        // Ordenamos la lista.
        Collections.sort(nombres); 
         
        // Imprimimos
        for (Object nombre : nombres) {
            System.out.println(nombre);
        }
       
    }        
}


