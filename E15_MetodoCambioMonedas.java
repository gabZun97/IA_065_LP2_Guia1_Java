/*
 * Crea un aplicación que nos convierta una cantidad de lps introducida 
 * por teclado a otra moneda, estas pueden ser a dolares, euros.
 * El método tendrá como parámetros, la cantidad de lps y la moneda 
 * a pasar que sera una cadena, este no devolverá ningún valor, mostrara un mensaje indicando el cambio.
 */
package EjerciciosLenguajeII_1400;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class E15_MetodoCambioMonedas {
    public static double convertidor(double cant, int moneda){
        double conversion = 0;
        switch(moneda){
            case 1: //asumiendo que 1 dolar = Lps. 24.5 
                conversion = cant/24.5;
                break;
            case 2: // asumiendo que 1 euro = Lps 28.2
                conversion = cant/28.2;
                break;
            case 3: //asumiendo que 1 Quetzal = Lps. 3 
                conversion = cant/3;
                break;
            default:
                System.out.println("Moneda no definida");
                break;
        }
        return conversion;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        
        int moneda;
        double cantidad;
        char s = 's';
        System.out.println("Bienvenido\nCovertidor de Modenas\n");
        do{
            do{
                System.out.println("\nPor favor seleccione a que moneda desea convertir: \n1. Dolares\n2. Euros\n3. Quetzales");
                System.out.print("=>");
                moneda = in.nextInt();
            }while(moneda != 1 && moneda != 2 && moneda != 3);

            do{
                System.out.println("Ingrese la cantidad de Lempiras que desea convertir: ");
                System.out.print("=>");
                cantidad = in.nextDouble();
            }while (cantidad <= 0);

            //como ya se valido que los valores ingresados fueran correctos directamente podemos llamar al metodo
            switch(moneda){
                case 1: 
                    System.out.println("---------------------------");
                    System.out.println(" Lps."+cantidad+" = Dlr."+df.format(convertidor(cantidad, moneda)));
                    System.out.println("---------------------------");
                    break;
                            
                case 2: 
                    System.out.println("---------------------------");
                    System.out.println(" Lps."+cantidad+" = Eur."+df.format(convertidor(cantidad, moneda)));
                    System.out.println("---------------------------");
                    break;
                case 3: 
                    System.out.println("---------------------------");
                    System.out.println(" Lps."+cantidad+" = Qtz."+df.format(convertidor(cantidad, moneda)));
                    System.out.println("---------------------------");
                    break;
                default:
                    System.out.println("Moneda no definida");
                    break;
            }
            System.out.print("¿Desea realizar una nueva conversión? s=si / n=no: ");
            s = (char)System.in.read();
        }while(s == 's');
        
    }
}
