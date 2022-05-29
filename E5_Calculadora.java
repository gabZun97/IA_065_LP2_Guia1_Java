/*
 * Construya un programa que realice las operaciones básicas de una calculadora (+,-,*,/,%,^) de dos números
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E5_Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x,y;
        int ope;
        
        System.out.println("Que operacion desea realizar?: ");
        System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Módulo\n6. Potencia");
        System.out.print("->");
        ope = in.nextInt();
        
        System.out.print("Ingrese el primer valor : ");
        x = in.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        y = in.nextDouble();
        
        switch(ope){
            case 1: //suma
                System.out.println("La suma de los valores es: "+(x+y));
                break;
            case 2: //resta
                System.out.println("La resta de los valores es: "+(x-y));
                break;
            case 3: //multiplicacion 
                System.out.println("La multipliación de los valores es: "+(x*y));
                break;
            case 4: //division 
                System.out.println("La division de los valores es: "+(x/y));
                break;
            case 5: //modulo
                System.out.println("El Residuo de dividir "+x+"/"+y+" es: "+(x%y));
                break;
            case 6: //potencia
                System.out.println("La Potencia de los valores es: "+ Math.pow(x,y));
                break;
            default:
                System.out.println("Operación no definida!");
                    break;
        }
    }
}
