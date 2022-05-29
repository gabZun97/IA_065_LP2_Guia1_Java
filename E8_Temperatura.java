/*
 * Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo de clima
de acuerdo a la siguiente tabla. (Use condicional múltiple).
 * Temperatura en Centigrados   Tipo de clima 
 *       TP <= 10                frio			
 *       10 > TP <= 20           nublado
 *       20 > TP <= 30           caluroso 
 *       > 30                    tropical
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E8_Temperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float grados;
        System.out.println("Ingrese la temperatura en centigrados: ");
        grados = in.nextFloat();
        
        if(grados <= 10.0){
            System.out.println("Tipo de clima: FRIO ");
        }else if(grados > 10.0 && grados <= 20.0){
            System.out.println("Tipo de clima: NUBLADO");
        }else if(grados > 20.0 && grados <= 30.0){
            System.out.println("Tipo de clima: CALUROSO");
        }else if(grados > 30.0){
            System.out.println("Tipo de clima: TROPICAL");
        }else{
            System.out.println("Error en la temperatura ingresada.");
        }
    }
}
