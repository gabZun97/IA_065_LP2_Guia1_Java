/*
 * Un programa que lea 5 elementos enteros de un arreglo y muestre su suma
 */
package EjerciciosLenguajeII_1400;


import java.util.Scanner;
public class E21_VectorLlenarMostrar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeros[] = new int[5]; //declarando e instanciando
        int numerosAleatorios[] = new int[10];
        int suma =0;
        
         for(int i=0; i<numerosAleatorios.length;i++){ //especificar el rango (Max-Min)+min
             numerosAleatorios[i] = (int)(Math.random()*(20-5)+5);
         }
         for(int i=0; i<numerosAleatorios.length;i++){
             System.out.println("Elemento Aleatorio "+(i+1)+":"+numerosAleatorios[i]);
         }
        
        /*for(int i=0; i<numeros.length;i++){
            System.out.print("Ingrese un numero entero en la posición #"+(i+1)+": ");
            numeros[i] = in.nextInt();
        }
        //mostrando elementos
        for(int i=0; i<numeros.length;i++){
            System.out.println("Elemento "+(i+1)+": "+numeros[i]);
            suma += numeros[i];
        }
        System.out.println("La suma de todos los elementos es: "+suma);
        */
    }
}
