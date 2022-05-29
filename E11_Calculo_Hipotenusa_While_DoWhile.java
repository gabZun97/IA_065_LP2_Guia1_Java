/*
 * Contruya un programa que calcule la hipotenusa de n triangulos rectos
 * condicionar que ambos lados conocidos sean mayores que 5 y que el programa
 * pueda calcular tantas veces como el usuario lo requiera.
 * 
 */
package EjerciciosLenguajeII_1400;

import java.io.IOException;
import java.util.Scanner;
public class E11_Calculo_Hipotenusa_While_DoWhile{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char seguir = 's'; //centinela
        double a,b,c;
        do{
            System.out.print("Ingrese el lado 1: ");
            a = in.nextDouble();
            System.out.print("Ingrese el lado 2: ");
            b = in.nextDouble();
            while(a>5 && b>5){
                c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
                System.out.println("La hipotenusa del triangulo recto es: "+c);
                a=0;
            }
            System.out.println("¿Desea realizar otro calculo? s=si / n=no: ");
            seguir = (char) System.in.read();
        }while(seguir == 's');
    }
}