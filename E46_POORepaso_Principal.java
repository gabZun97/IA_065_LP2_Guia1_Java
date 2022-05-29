/*
 * Ejercicio Previo a la prueba:
Determine las ventas anuales de 4 vendedores de dos tiendas de calzado mismos que
están 2 en una y 2 en la otra, considerando ventas por cada mes. Al igual que su bono
anual por volumen de ventas mismo que representa el 8% del volumen de las ventas
anuales. Determine cual de todos los vendedores hizo una mayor venta en el año , las
ventas anuales de todos los vendedores y su respectivo bono.

Utilice arreglos, orientación a objetos y sus diversas propiedades.

Clase Tienda
• Nombre 
• Direccion 
• RTN
• Ventas totales

1. Ventas totales (ventas sucursal 1, ventas sucursal 2)
Clase sucursal extends Tienda 
• Nombre sucursal 
• Ventas de la sucursal

1. Ventas totales (ventas vendedor 1, ventas vendedor 2)
Clase Vendedor extends sucursal
• Nombre vendedor 
• Ventas del vendedor
• Bono 

1. Ventas totales (ventas de todos los meses)
2. Bono (ventas de todos los meses)

 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;

public class E46_POORepaso_Principal {
    public static void main(String[] args) {
        E46_POORepaso_Vendedor v = new E46_POORepaso_Vendedor();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca el nombre del vendedor: ");
        v.setNombreVendedor(in.nextLine());
        for (int i = 0; i < v.mes.length; i++) {
            System.out.println("Introduzca el total de las ventas del mes " + v.mes[i] +": ");
            try {
                v.setVentas(i, Double.parseDouble(in.nextLine()));
            } catch (NumberFormatException ex) {
                System.out.println("valor incorrecto");
                i--;
            }
        }
        System.out.println("El total vendido durante el año fue: " + v.getVentas());
        v.calcularBono();
        System.out.println("El bono ganado es: "+v.getBono());

    }
}
