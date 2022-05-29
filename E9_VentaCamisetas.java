/*
 * Calcule el Total a Pagar de una venta de camisetas a beneficio de los niños quemados en HN, 
 * misma que individualmente tienen un costo de L.200.00, utilice la Estructura de control Switch para aplicar los descuentos
 * De acuerdo a la cantidad que se compre se deben aplicar los siguientes descuentos:
 * a.	1 - 10 –  Descuento 5%
 * b.	11 - 50 –  Descuento 8%
 * c.	51 - 100 –  Descuento 10%
 * d.	101- 500 –  Descuento 12%
 * e.	501 en adelante –  Descuento 15%
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E9_VentaCamisetas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int cantidad, caso=0;
        float descuento, total;
        
        System.out.println("Ingrese la cantidad de camisetas a comprar: ");
        cantidad = in.nextInt();
        
        if(cantidad > 1 && cantidad <=10){
            caso = 1;
        }else if(cantidad > 10 && cantidad <=50){
            caso = 2;
        }else if(cantidad > 50 && cantidad <=100){
            caso = 3;
        }else if(cantidad > 100 && cantidad <=500){
            caso = 4;
        }else if(cantidad > 500){
            caso = 5;
        }
        
        
        switch(caso){
            case 1: //5
                descuento = (float) ((cantidad*200)*0.05);
                total = (float) ((cantidad*200)-descuento);
                System.out.println("Descuento aplicado: Lps."+descuento);
                System.out.println("Total a Pagar: Lps."+total);
                break;
            case 2: //8
                descuento = (float) ((cantidad*200)*0.08);
                total = (float) ((cantidad*200)-descuento);
                System.out.println("Descuento aplicado: Lps."+descuento);
                System.out.println("Total a Pagar: Lps."+total);
                break;
            case 3: //10
                descuento = (float) ((cantidad*200)*0.1);
                total = (float) ((cantidad*200)-descuento);
                System.out.println("Descuento aplicado: Lps."+descuento);
                System.out.println("Total a Pagar: Lps."+total);
                break;
            case 4://12
                descuento = (float) ((cantidad*200)*0.12);
                total = (float) ((cantidad*200)-descuento);
                System.out.println("Descuento aplicado: Lps."+descuento);
                System.out.println("Total a Pagar: Lps."+total);
                break;
            case 5: //15
                descuento = (float) ((cantidad*200)*0.15);
                total = (float) ((cantidad*200)-descuento);
                System.out.println("Descuento aplicado: Lps."+descuento);
                System.out.println("Total a Pagar: Lps."+total);
                break;
            default:
                System.out.println("Cantidad no válida!");
                break;
                
        }
    }
}
