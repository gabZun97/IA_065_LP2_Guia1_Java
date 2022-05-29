/*
 * Una farmacia desea un programa para ingresar el valor de compra y calcular lo siguiente: si el pago se efectúa al “contado”, 
   calcular un descuento del 5%; pero si el pago es con “tarjeta” se incrementa un recargo del 3% al valor de compra. Calcular y 
   visualizar el descuento o recargo según sea el caso y el total a pagar de la compra.
 */
package EjerciciosLenguajeII_1400;

import java.io.*;
import java.util.Scanner;
public class E7_Famacia {
    public static void main(String[] args) throws IOException {
        //instanciar
        Scanner in = new Scanner(System.in);
        
        double compra = 0.0, descuento = 0.0, totalpago = 0.0;
        char opcion;
        System.out.print("Ingrese por favor el valor de la compra: ");
        compra = in.nextDouble();
        
        System.out.println("¿Cómo efectuará su pago: \n1. Contado\n2. Tarjeta");
        opcion = (char) System.in.read();
        
        switch(opcion){
            case '1':
                descuento = compra * 0.05;
                totalpago = compra - descuento;
                System.out.println("Su descuento es: "+descuento);
                System.out.println("Total a Pagar: "+totalpago);
                break;
            case '2':
                descuento = compra * 0.03;
                totalpago = compra + descuento;
                System.out.println("Su recargo es: "+descuento);
                System.out.println("Total a Pagar: "+totalpago);
                break;
            default:
                System.out.println("Forma de pago no válida");
                break;
        }
        
    }
}
