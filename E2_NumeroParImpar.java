/*
 * Determine si un numero ingresado por el usuario es par o impar
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner; //objeto Scanner para hacer la entradas de datos por el teclado
public class E2_numeroParImpar {
    public static void main(String[] args) { //metodo principal de la clase
        //instanciación de Scanner - Copia 
        Scanner in = new Scanner(System.in);
        //variables
        int numero;
        System.out.print("Ingrese por favor un numero entero: ");
        numero = in.nextInt();
        
        //procesos
        if(numero%2 == 0){ //PAR
            System.out.println("El número "+numero+" es PAR!");
        }else{ //IMPAR
            System.out.println("El número "+numero+" es IMPAR!");
        }
    }
}
