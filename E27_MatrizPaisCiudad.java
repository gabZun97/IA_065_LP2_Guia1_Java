/*
 * Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de
    estos países. Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer
    índice sea el número asignado a cada país y el segundo índice el número asignado a cada ciudad.
    Ejemplo de resultados que debe mostrar el programa:
    País: Argentina Ciudades: Buenos Aires Cordoba La Plata
    País: España Ciudades: Madrid Lugo Sevilla
    País: Francia Ciudades: Paris Niza Lyon
    País: Italia Ciudades: Roma Napoles Sicilia 

    El programa debe permitir mostrar todos los datos ingresados y tambien debe pedir ingresar cualquier 
    ciudad e indicar el pais al que pertenece si esta registrado.
 */
package EjerciciosLenguajeII_1400;

import java.io.IOException;
import java.util.Scanner;
public class E27_MatrizPaisCiudad { 
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //declaraciones         
        final int npais = 4;
        final int nciudades = 4; //porque en la primera columna almacenare el pais   
        String [][]matriz = new String[npais][nciudades];
        char seguir = 's';
        int opcion=0;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println("1. Llenar la matriz");
            System.out.println("2. Mostrar datos de la matriz");
            System.out.println("3. Buscar ciudad");
            opcion = in.nextInt();
            switch(opcion){
                case 1: //llenar matriz
                    llenaMatriz(matriz);
                    break;
                case 2: //mostrarla
                    muestraMatriz(matriz);
                    break;
                case 3://buscar
                    buscaMatriz(matriz);
                    break;
                default:
                    System.out.println("Opción del menu no válida");
                    break;
            }  
            System.out.println("Desea continuar? s=si / n=no : ");
            seguir = (char) System.in.read();
        }while(seguir == 's');
        
    }
    //llenar matriz 
    public static void llenaMatriz(String a[][]){
        in.nextLine(); //buffer
        for(int i=0; i<a.length;i++){            
            System.out.print("Ingrese el nombre del país "+(i+1)+": ");
            a[i][0] = in.nextLine();
            for(int j=1; j<a[i].length;j++){
                System.out.println("Ingrese el nombre de la ciudad "+j+": ");
                a[i][j] = in.nextLine();
            }
        }
    }
    //mostrar los datos de la matriz 
    public static void muestraMatriz(String a[][]){
        for(int i=0; i<a.length;i++){
            System.out.println("País: "+a[i][0]);
            for(int j=1; j<a[i].length;j++){
                System.out.println("\tCiudad: "+a[i][j]);
            }
        }
    }
    
    //buscar ciudad en la matriz y que me diga el pais 
    public static void buscaMatriz(String a[][]){
        /*String ciudad = ""; 
        in.nextLine();
        System.out.print("Ingrese el nombre de la ciudad que desea buscar: ");
        ciudad = in.nextLine();
        for(int i=0; i<a.length;i++){
            for(int j=1; j<a[i].length;j++){
                if(a[i][j].equalsIgnoreCase(ciudad)){
                    System.out.println("La ciudad "+ciudad+" pertenece al país:"+a[i][0]);
                }else{
                    System.out.println("La ciudad "+ciudad+" no esta registrada en el arreglo.");
                }                
            }
        }*/
        String ciudad = "";
        in.nextLine(); // buffer    
        boolean contador = false;
        int c = 0; //indice en el cual esta almacenado el pais 
        System.out.println("Ingrese el nombre de la ciudad a buscar: ");
        ciudad = in.nextLine();
        for(int i=0; i<a.length;i++){
            for(int j=1;j<a[i].length;j++){
                if(a[i][j].equalsIgnoreCase(ciudad)){
                    contador = true;
                    c=i; //numero de la fila donde esta el pais                     
                }
            }
        }
        
        if(contador == true){
            System.out.println("La ciudad "+ciudad+" pertenece al país "+a[c][0]);
        }else{
            System.out.println("La ciudad "+ciudad+" no esta registrada en el arreglo.");
        }
        
    }
}