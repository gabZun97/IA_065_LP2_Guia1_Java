/*
 * Leer la altura de n personas y calcula cual es la estatura promedio, 
 * cuantas personas hay arriba y cuantas bajo el promedio
 */
package EjerciciosLenguajeII_1400;
import java.util.*;
public class E25_VectorAlturaPersona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0; //numero de personas 
        int totalEstaturas=0,promedio=0,personasArriba=0,personasBajo=0;
        System.out.print("¿Cuántas personas ingresará?");
        n = in.nextInt();
        //declarar el vector
        int estaturas[] = new int[n];
        System.out.println("Ingrese la estatura de las "+n+" personas: ");
        for(int i=0; i<n;i++){
            System.out.print("Estatura Persona "+(i+1)+" : ");
            estaturas[i]=in.nextInt();
            totalEstaturas+=estaturas[i]; //acumulo las estaturas para calculo del promedio
        }
        //calcular el promedio
        promedio = (totalEstaturas/n);
        System.out.println("PROMEDIO: "+promedio);
        for(int i=0; i<n;i++){
            if(estaturas[i]>promedio){ //arriba
                personasArriba++;
            }else if(estaturas[i]<promedio){
                personasBajo++;
            }
        }
        System.out.println("Personas con estatura Arriba del Promedio: "+personasArriba);
        System.out.println("Personas con estatura Bajo el Promedio: "+personasBajo);   
    }
}
