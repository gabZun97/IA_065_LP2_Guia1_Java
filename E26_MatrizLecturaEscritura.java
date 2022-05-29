/*
 * Considere una matriz de 2X3 llenela con valores numericos enteros 
 * utilizando un metodo llamado "leer" y muestrela en pantalla usando un metodo "mostrar"
 */
package EjerciciosLenguajeII_1400;

import java.util.*;
public class E26_MatrizLecturaEscritura {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {        
        //declarar e instanciar mi matriz 
        int [][]v = new int[2][3]; 
        leer(v);
        mostrar(v);
    }
    public static void leer(int a[][]){
        System.out.println("Llenando la matriz: ");
        for(int i=0; i<a.length;i++){ //filas
            for(int j=0; j<a[i].length;j++){ //columnas -> ira calculando el tamaño de las columnas por cada fila (arreglos irregulares)
                System.out.print("Leyendo elemento ["+i+"]["+j+"]: ");
                a[i][j] = in.nextInt();
            }
        }
    }
    public static void mostrar(int a[][]){
        for(int i=0; i<a.length;i++){ //filas
            for(int j=0; j<a[i].length;j++){
                System.out.println("Imprimiendo el elemento ["+i+"]["+j+"]: "+a[i][j]);
            }
        }
    }
}
