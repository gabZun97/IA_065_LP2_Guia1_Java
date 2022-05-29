/*
 * Realizar un programa que simule un inicio de sesión solicitando el nombre de usuario y contraseña, y 
 *   mostrar un mensaje en pantalla, inicio de sesión correcto/ nombre de usuario incorrecto.
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E6_InicioSesion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String usuario = "user1", user;
        String clave = "12345", key;
        
        System.out.println("Bienvenido al Sistema XYZ\n\n");
        System.out.println("Por favor ingrese sus accesos:");
        System.out.print("Usuario: ");
        user = in.nextLine();
        System.out.print("Contraseña: ");
        key = in.nextLine();
        
        //equals, compareto
        
        if(user.equals(usuario)  && key.equals(clave)){
            System.out.println("Inicio de sesión correcto");
        }else{
            System.out.println("Usuario o contraseña incorrecta, por favor verifique!");
        }
        
    }
}
