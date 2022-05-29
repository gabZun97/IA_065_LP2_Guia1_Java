/*
 * Crear un método que muestre los datos nombre, apellido y la edad de una persona, ingresados por teclado
 * Indique si esta persona es mayor de edad.
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E12_MetodoInfoPersona {    
    public static void persona(){
        String nombre, apellido;
        int edad;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = in.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = in.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = in.nextInt();
        
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad);
        
        
        if(edad > 17){
            System.out.println("Es mayor de edad!");
        }else{
            System.out.println("Es menor de edad!");
        }        
    }
    public static void main(String[] args) {
        persona();
    }
}
