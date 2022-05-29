/*
 * Entradas y salidas al sistema
 */
package EjerciciosLenguajeII_1400;

//import java.io.*; //paquete
import java.util.Scanner; // ENTRADAS AL SISTEMA
//Definición de la clase
public class E1_Entradas_Salidas {    
    public static void main(String[] args) {
        
        

        //Intrucciones   
        //SALIDAS
        System.out.println("Hola mundo! bienvenidos a lenguaje II :)\n Esta es otra línea Forma 1");
        System.out.print("IMPRIMIENDO UNA LINEA Forma 2\n\n");
        System.out.printf("%s\n%s\n%d\n", "Lenguajes de programación II", "Forma 3 de salidas del sistema",2022);
        
        //Crear un objeto de tipo Scanner para poder hacer las entradas (instanciación)
        Scanner in = new Scanner(System.in);
        //variables 
        int num1;
        int num2;
        int suma;
        //ENTRADAS asumiendo que sumaremos dos numeros enteros
        System.out.print("Ingrese el primer número entero : ");
        num1 = in.nextInt(); // capturo el valor entero proporcionado por usuario
        System.out.print("Ingrese el segundo número entero : ");
        num2 = in.nextInt(); // capturo el valor entero proporcionado por usuario
        
        //Procesos 
        suma = num1 + num2;
        
        //Salidas
        System.out.printf("La suma de los dos valores enteros es:  %d\n",suma);
        in.close(); //cerremos nuestro objeto scanner
        
        
    }
}
