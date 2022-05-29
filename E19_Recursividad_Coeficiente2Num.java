/*
 * Calculando el coeficiente de dividir dos numeros con recursividad
 */
package EjerciciosLenguajeII_1400;
import java.util.Scanner;
public class E19_Recursividad_Coeficiente2Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.println("Introduzca el dividendo: ");
        n1 = in.nextInt();
        do{
            System.out.println("Introduzca el divisor: (debe ser mayor que cero): ");
            n2 = in.nextInt();
        }while(n2 <= 0);
        System.out.println("El cociente de dividir ambos numeros es: "+coeficiente(n1,n2));
    }
    public static int coeficiente(int a, int b){
        if(a<b){ //asumir caso base de retornar un valor entero
            return 0;
        }else{
            return 1+coeficiente(a-b,b);
        }
    }
}
