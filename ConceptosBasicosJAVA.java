
package ExamenesLenguajeII_1400;

import java.io.IOException;
import java.util.Scanner;

public class ConceptosBasicosJAVA {
    static Scanner in = new Scanner(System.in);
    static int mesa = 0;
    public static void main(String[] args) throws IOException {
        char s = 's';
        int numeroClientes = 0;
        do{
            System.out.println("Bienvenido al Cafe Mi Tierra Honduras");
            System.out.println("");
            System.out.println("¿Cuantos clientes nos visitan?");
            numeroClientes = in.nextInt();
            if(numeroClientes > 0){
                //reservar una mesa
                reservar();
                //realizamos un pedido
                tomarPedido(numeroClientes);
                //
            }else{
                System.out.println("Debe ingresar un numero de clientes valido.");
            }
            System.out.print("¿Desea realizar una nueva transacción? s=si / n=no: ");
            s = (char)System.in.read();
        }while(s == 's');
    }
    public static void reservar(){
        System.out.println("::::::::::::ESPACIOS DISPONIBLES::::::::::::::");
        System.out.println("1. Mesa 1............2 Personas");
        System.out.println("2. Mesa 2............3 Personas");
        System.out.println("3. Mesa 3............4 Personas");
        System.out.println("4. Mesa 4............5 Personas");
        System.out.println("5. Mesa 5............6 Personas");  
        System.out.print("->");
        mesa = in.nextInt();
    }
    public static void tomarPedido(int nc) throws IOException{
        char s = 's';
        double totalPagar=0.0;
        int bebida=0, reposteria=0, cbebida=0, creposteria=0;
        float pbebida=0, preposteria=0;
        String nombreBebidas = "";
            do{
                System.out.println("::::::::::::MENU::::::::::::::\n");
                System.out.println("::::::::BEBIDAS FRIAS:::::::::");
                System.out.println("1. Granita Fresa......Lps 25");
                System.out.println("2. Piña Colada........Lps 25");
                System.out.println("3. Granita de Café....Lps 25");
                System.out.println("\n:::::::BEBIDAS CALIENTES:::::::");
                System.out.println("4. Café negro.........Lps 20");
                System.out.println("5. Cappuccino.........Lps 25");
                System.out.println("6. Té frutos rojos....Lps 18");
                System.out.println("7. Té Manzanilla......Lps 18");
                System.out.print("Bebida: ");
                bebida = in.nextInt();
                switch(bebida){
                    case 1:
                        nombreBebidas=nombreBebidas.concat("Granita Fresa......Lps 25,");
                        break;
                    case 2:
                        nombreBebidas=nombreBebidas.concat("Piña Colada........Lps 25,");
                        break;
                    case 3:
                        nombreBebidas=nombreBebidas.concat("Granita de Cafe....Lps 25,");
                        break;
                    case 4:
                        nombreBebidas=nombreBebidas.concat("Café negro.........Lps 20,");
                        break;
                    case 5:
                        nombreBebidas=nombreBebidas.concat("Cappuccino.........Lps 25,");
                        break;
                    case 6:
                        nombreBebidas=nombreBebidas.concat("Té frutos rojos....Lps 18,");
                        break;
                    case 7:
                        nombreBebidas=nombreBebidas.concat("Té Manzanilla......Lps 18,");
                        break;
                    default:
                        break;
                }
                System.out.print("Precio: ");
                pbebida = in.nextFloat();
                System.out.print("Cantidad: ");
                cbebida = in.nextInt();
                System.out.println("\n::::::::::REPOSTERIA::::::::::");
                System.out.println("1. Pan de Queso.......Lps 25");
                System.out.println("2. Marquesote.........Lps 25");
                System.out.println("3. Galleta de Avena...Lps 25");
                System.out.print("Opción: ");
                reposteria = in.nextInt();
                switch(reposteria){
                    case 1:
                        nombreBebidas=nombreBebidas.concat("Pan de Queso.......Lps 25,");
                        break;
                    case 2:
                        nombreBebidas=nombreBebidas.concat("Marquesote.........Lps 25,");
                        break;
                    case 3:
                        nombreBebidas=nombreBebidas.concat("Galleta de Avena...Lps 25,");
                        break;
                    default:
                        break;
                }
                System.out.print("Precio: ");
                preposteria = in.nextFloat();
                System.out.print("Cantidad: ");
                creposteria = in.nextInt();
                //llamamos a nuestro metodo facturar para ir acumulando los calculos
                totalPagar += facturar(pbebida,cbebida,preposteria,creposteria);
                System.out.print("¿Desea seleccionar mas productos? s=si / n=no: ");
                s = (char)System.in.read();                
            }while(s == 's');
            
            
            //variables adicionales
            double descuento = 0, isv = 0, consumototal = 0;
            //facturamos
            if(totalPagar > 500){ //aplicamos descuento                
                descuento = totalPagar*0.05;                
                isv = (totalPagar - descuento)*0.15;
                consumototal = (totalPagar - descuento) + isv;
            }else{
                isv = totalPagar*0.15;
                consumototal = totalPagar + isv;
            }
            //construimos la factura
            System.out.println("==============================================");
            System.out.println("===================FACTURANDO==================");
            System.out.println("==============================================");
            System.out.println("Mesa: "+mesa);
            System.out.println("Detalle de Productos:");            
            System.out.println(nombreBebidas.replace(',', '\n'));
            System.out.println("Descuento : Lps."+descuento);
            System.out.println("ISV 15% : Lps."+isv);
            System.out.println("Consumo Total : Lps."+consumototal);
            System.out.println("==============================================");
            System.out.println("===================FIN FACTURA=================");
            System.out.println("==============================================");
        
    }
    public static double facturar(float pbebida, int cbebida, float preposteria, int creposteria){
        double consumo; 
        consumo = (pbebida*cbebida) + (preposteria*creposteria);        
        return consumo;
    }
}
