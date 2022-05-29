/*
 * Construir un programa que cuente los positivos, negativos y ceros en un array de 50 elementos
 */
package EjerciciosLenguajeII_1400;
import java.util.Scanner;
public class E23_VectorArregloPNC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaraciones
        int p=0,n=0,c=0;
        int num[] = new int[50];
        
        //llenar el vector
        for(int i=0; i<num.length; i++){
            num[i] = (int)(Math.random()*50)-15;
        }
        //contar los elementos del arreglo
        for(int i=0; i<num.length; i++){
            if(num[i] > 0){ //positivos
                p++;
            }else if(num[i]==0){ //ceros
                c++;
            }else if(num[i]< 0){
                n++;
            }
            System.out.println(num[i]);
        }
        System.out.println("Elementos Positivos: "+p);
        System.out.println("Elementos Negativos: "+n);
        System.out.println("Elementos Ceros: "+c);
    }
}
