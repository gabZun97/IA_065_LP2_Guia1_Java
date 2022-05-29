/* Ejemplo Interfaz Collection */
package EjerciciosLenguajeII_1400;

import java.util.ArrayList;
import java.util.Collection;
public class E33_collections {
    public static void main(String[] args) {
        Collection listaMarcasCoches = new ArrayList<String>(); // El tipo de listaMarcasCoches es Collection
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
        System.out.println("Número elementos antes de eliminar: " + listaMarcasCoches.size() ) ;
        System.out.println (listaMarcasCoches.toString() ) ;
        listaMarcasCoches.remove ("Seat");
        listaMarcasCoches.remove ("Mercedes");
        System.out.println("Número elementos después de eliminar Seat y Mercedes:" + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () );
    }
}


