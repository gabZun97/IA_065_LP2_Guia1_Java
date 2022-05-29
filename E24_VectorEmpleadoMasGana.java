/*
 * Construir un programa que muestre el empleado que mas gana, suponga vectores de 4 elementos 
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E24_VectorEmpleadoMasGana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaraciones
        String empleados[] = new String[4];
        double sueldo[] = new double[4];
        
        //variables auxiliares 
        String nombreMayor;
        double sueldoMayor;
        int i=0;
        //leemos el primer empleado y este se tomara como el mayor
        System.out.print("Empleado "+(i+1)+": ");
        empleados[i]=in.nextLine();
        System.out.print("Sueldo "+(i+1)+": ");
        sueldo[i]=in.nextDouble();
        
        //pasarle valores a nuestras variables auxiliares 
        nombreMayor = empleados[i];
        sueldoMayor = sueldo[i];
        
        //leer los demas empleados
        for(i=1;i<empleados.length;i++){
            in.nextLine(); /*limpiando el buffer*/
            /*Deja un caracter "n" o "enter" se interpreta como el final de la instruccion y pasa a la siguiente*/
            System.out.print("Empleado "+(i+1)+": ");
            empleados[i]=in.nextLine();
            System.out.print("Sueldo "+(i+1)+": ");
            sueldo[i]=in.nextDouble();
            
            //comparando los empleados 
            if(sueldo[i]>sueldoMayor){
                sueldoMayor = sueldo[i];
                nombreMayor = empleados[i];
            }
        }
        //imprimir el empleado que gana mas 
        System.out.println("Empleado que mas gana: "+nombreMayor);
        System.out.println("Sueldo : "+sueldoMayor);
        
        
    }
}
