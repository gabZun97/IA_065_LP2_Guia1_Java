/*
 * Elabore un método que simule el proceso de subir a un piso en un ascensor, 
 * donde el numero de piso es ingresado por teclado.
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E13_MetodoAscensor {
    public static void ascensor(int x){
         for(int i = 1; i<=x; i++){
             if(i==1){
                 System.out.println("El piso "+i+" es el inicial.");
             }else{
                 System.out.println("Subio al piso : "+i);
             }             
         }                     
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pisos;
        System.out.print("Ingrese la cantidad de pisos: ");
        pisos = in.nextInt();
        System.out.println("Previo a llamar al metodo");
        ascensor(pisos);
        System.out.println("Posterior a la llamada al metodo");
    }
}
