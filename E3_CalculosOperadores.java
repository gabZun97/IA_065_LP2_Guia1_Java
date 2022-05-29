/*
 * Realizar un programa que calcule el gasto por realizar un evento de 8 horas
 * o menos en una empresa. Por cada puesto que se instale se gastan Lps. 750.00,
 * por cada persona que ingresa al evento, hay un gasto de Lps. 25.00.
 * Además, el evento puede extenderse más de 8 horas, por lo que los organizadores
 * calcularon un gasto extra de Lps. 500.00 por cada hora extra.
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E3_CalculosOperadores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /*cantidad de puestos, cantidad de personas, duración en horas del evento
        */
        //variables 
        int puestos = 0;
        int personas = 0;
        float horas = 0;
        float horasExtra = 0;
        float total = 0;
        
        System.out.print("Ingrese la duración del evento: ");
        horas = in.nextFloat();
        System.out.print("Ingrese el número de personas que asistieron al evento: ");
        personas = in.nextInt();
        System.out.print("Ingrese el número de puestos instalados en el evento: ");
        puestos = in.nextInt();
        
        //horas extras 
        horasExtra = horas - 8;
        
        //calcular el total
        total = (750*puestos) + (25*personas) + (500*horasExtra);
        
        System.out.println("El total de gasto el en el evento es: Lps."+total);
    }
}
