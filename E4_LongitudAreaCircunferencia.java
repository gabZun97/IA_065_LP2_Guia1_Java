/*
 * LONGITUD Y AREA DE UNA CIRCUNFERENCIA, VOLUMEN DE UNA ESFERA
 *	longitud = 2*pi*radio
 *	area = pi*radio^2
 *	volumen = pi*radio^3*3/4


 *  Math.ceil -> round hacia arriba 1.1 como 1.9 suben a 2
 *  Math.floor -> round hacia abajo 1.1 como 1.9 se hacen 1
 *  Math.round -> round 1.4999999 se hacen 1 y 1.5 se hace 2
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
import java.text.DecimalFormat; /*DARLE FORMATO A LA IMPRESION NUMEROS*/
public class E4_LongitudAreaCircunferencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        //variables 
        float radio, longitud, area, volumen;
        
        System.out.print("Ingrese por favor el radio: ");
        radio = in.nextFloat();
        
        //longitud
        //Cast -> operacion especial que me permite convertir el resultado de la operacion en float ya que involucra diversos tipos de datos
        
        
        longitud =  (float)(2*Math.PI*radio);
        System.out.println("La longitud de la circunferencia es: "+df.format(longitud));
        //Area
        area =  (float) (Math.PI*(radio*radio));
        System.out.println("El área de la circunferencia es: "+df.format(area));
        area = (float) (Math.PI*(Math.pow(radio, 2)));
        System.out.println("El área de la circunferencia es: "+df.format(area));
        
        //Volumen =  pi*radio^3*3/4
        volumen = (float) (Math.PI*(Math.pow(radio,3))*3/4);
        System.out.println("El volumen de la esfera con radio "+radio+" es: "+volumen);
        volumen = (float) (Math.PI*(radio*radio*radio)*3/4);
        System.out.println("El volumen de la esfera con radio "+radio+" es: "+df.format(volumen));
    }
}
