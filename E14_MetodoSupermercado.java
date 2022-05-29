/*
 * En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los Lps 1000 
 * en las áreas de frutas, verduras y abarrotes. ¿ Cual sera el total que pagara una persona por su compra,
 * se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar….
 */
package EjerciciosLenguajeII_1400;

import java.util.Scanner;
public class E14_MetodoSupermercado {
    static Scanner in = new Scanner(System.in);
    public static void compra(){
        //variables
        //Scanner in = new Scanner(System.in);
        String nombreProducto = "";
        double precio = 0.0, total = 0.0, descuento = 0.0;
        int cantidad;
        System.out.print("Nombre del producto: ");
        nombreProducto = in.nextLine();
        System.out.print("Precio del producto: ");
        precio = in.nextDouble();
        System.out.print("Cantidad de producto: ");
        cantidad = in.nextInt();
        //calculos
        total = precio*cantidad;
        
        //salidas
        System.out.println("Producto: "+nombreProducto);
        System.out.println("Precio unitario: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Total: Lps."+total);
        if(total > 1000){
            descuento = total*0.2;            
        }
        System.out.println("Descuento: Lps."+descuento);
        System.out.println("Total neto a pagar: Lps."+(total-descuento));
        
    } 
    public static void areasSupermercado(){
        //ingreso del cliente y llamaremos a metodo compra de acuerdo al area
        //variables
        String nombreCliente, area;
        int seguir = 1;
        do{            
            System.out.print("Nombre del Cliente: ");
            nombreCliente = in.nextLine();
            System.out.print("Area del Supermercado: ");
            area = in.nextLine();  
            System.out.println("Cliente: "+nombreCliente);
            switch(area){
                case "frutas":                    
                    compra();
                    break;
                case "verduras":
                    compra();
                    break;
                case "abarrotes":
                    compra();
                    break;
                default:
                    System.out.println("Area del supermercado no definida");
                    break;                
            }            
            System.out.println("Desea ingresar un nuevo cliente? 1=si / 2=no :");
            seguir = in.nextInt();
            in.nextLine();  //limpiar buffer          
        }while(seguir == 1);
    }
    
    public static void main(String[] args) {
       areasSupermercado();        
    }
}
