/*
 * Cnstruyendo un programa que llame a un metodo creado en otra clase que calcule el factorial de un numero entero cualquiera mayor que cero
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E16_MetodoClaseFactorial {
    public static void main(String[] args) {
        //instanciaciones de objetos
        Scanner in = new Scanner(System.in);
        E16_MetodoClaseFactorial1 fa = new E16_MetodoClaseFactorial1();        
        //variables
        int n = 0;
        //E/S
        System.out.println("Calculo de Factorial\n\nIngrese un numero entero mayor que cero. ");
        do{
            System.out.print("Número : ");
            n = in.nextInt();
        }while(n <= 0);
        
        //calculos
        System.out.println("El factorial de "+n+" es : "+fa.factorial(n));
    }
}
