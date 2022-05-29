/*
 * Calculando potencias sucesivas de 2^n con recursividad
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;        
public class E18_Recursividad_2ElevadoN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("Ingrese un numero entero: ");
            num = in.nextInt();
        }while(num < 0);
        System.out.println("La potencia 2^"+num+"= "+potencia(num));
    }
    public static double potencia(int n){
        if(n==0){ //caso base
            return 1;
        }else{            
            return 2*(potencia(n-1));
        }
    }
}
