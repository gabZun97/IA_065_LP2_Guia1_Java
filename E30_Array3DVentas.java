/*
 * Se le solicita que haciendo uso de arreglos 3D desarrolle lo siguiente:
    Contruya un programa que registre las ventas de 5 vendedores en 3 meses,
    y que por cada mes registre las ventas semanales(4) desarrolladas por cada vendedor,
    El programa deberá permitir mostrar las ventas de cada vendedor de forma individual y global.
    
    se sugiere:
    - crear un metodo para llenar el arreglo
    - otro metodo para realizar la busqueda individual 
    - otro para mostrar las ventas de todos los vendedores
 */

//APRENDIENDO JAVADOC
/**
 * Aprendiendo a usar arreglos multidimensionales
 * @author: Gabriel
 * @version: 01-01/03/2022
 */
package EjerciciosLenguajeII_1400;

import java.io.IOException;
import java.util.*;
import java.lang.Math;
public class E30_Array3DVentas {    
    public static void main(String[] args) throws IOException{        
        Scanner in = new Scanner(System.in);
        char s='s';
        int opcion=0;
        double [][][]ventas = new double[5][3][4]; //5x3x4
        do{
            System.out.println("Bienvenido al sistema");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Llenar el arreglo 3D aleatoriamente\n2. Buscar las ventas de un empleado.\n3. Mostrar todas las ventas.");
            opcion = in.nextInt();
            switch(opcion){
                case 1: //llenar el arreglo
                    llenarArreglo(ventas);
                    break;
                case 2: //buscar un empleado
                    System.out.print("Ingrese el número del empleado a buscar: ");
                    int criterio = in.nextInt();
                    buscarVendedor(ventas,criterio);
                    break;
                case 3:
                    mostrarTodas(ventas);
                    break;
                default:
                    System.out.println("Opción del menu no válida.");
                    break;
            }
            System.out.println("Desea continuar? s=si / n=no: ");
            s = (char)System.in.read();
        }while(s=='s');
        in.close(); //liberando la memoria //invocando a un destructor
    }
    //lenar
    public static void llenarArreglo(double a[][][]){
       int vendedores = a.length;
       int meses = a[0].length;
       int semanas = a[0][0].length;
       int contador=0;
       for(int i=0; i<vendedores; i++){ //vendedores
           for(int j=0; j<meses; j++){ //meses
               for(int s=0;s<semanas; s++){ //semanas
                   a[i][j][s] = (int)(Math.random()*5000)+1000;
                   contador++;
               }
           }
       }
       if(contador>0){
           System.out.println("Arreglo llenado satisfactoriamente.");
       }else{
           System.out.println("Error al llenar el arreglo.");
       }
    }
    //buscar ventas de empleado
    public static void buscarVendedor(double a[][][], int criterio){ //17,120
        int vendedores = a.length;
        int meses = a[0].length;
        int semanas = a[0][0].length;
        double ventasUltimoMes = 0;
        double ventasTotales = 0;
        for(int i=0; i<vendedores; i++){
            if(i==criterio){
                for(int j=0; j<meses; j++){
                    for(int s=0;s<semanas; s++){
                        ventasTotales += a[i][j][s];
                    }
                }
                System.out.println("Ventas totales del Vendedor "+criterio+": "+ventasTotales);
                
                
                System.out.println("Vendedor "+criterio+": ");
                for(int j=0; j<meses; j++){
                    if(j==2){ //ultimo mes                        
                        for(int s=0;s<semanas; s++){ //semanas
                            ventasUltimoMes += a[i][j][s];
                        }
                        System.out.println("Ventas del ultimo Mes: "+ventasUltimoMes);
                    }
                    /*System.out.println("Mes "+(j+1)+": ");
                    for(int s=0;s<semanas; s++){ //semanas
                        System.out.println("Semana "+(s+1)+": "+a[i][j][s]);
                    }
                    System.out.println("");*/
                }
            }
            
        }
    }
    
    
    //mostrar todas las ventas 
    public static void mostrarTodas(double a[][][]){
        int vendedores = a.length;
        int meses = a[0].length;
        int semanas = a[0][0].length;
        for(int i=0; i<vendedores; i++){ //vendedores
           System.out.println("Empleado "+i+": ");
           for(int j=0; j<meses; j++){ //meses
               System.out.println("Mes "+(j+1)+": ");
               for(int s=0;s<semanas; s++){ //semanas
                   System.out.println("Semana "+(s+1)+": "+a[i][j][s]);
               }
               System.out.println("");
           }
           System.out.println("");
       }
    }
   
}

