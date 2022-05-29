/*
 * Copiando Vectores 
 */
package EjerciciosLenguajeII_1400;

import java.lang.*;
public class E22_VectorCopiarArray {  

   public static void main(String[] args) {
       /*int arr1[] = { 9, 1, 2, 3, 4, 5 };
        int arr2[] = { 5, 10, 20, 30, 40, 50 };   

        // COPIANDO EL ARRAY
       System.arraycopy(arr1, 0, arr2, 0, 1);
        System.out.print("array2 = ");
        System.out.print(arr2[0] + " ");
        System.out.print(arr2[1] + " ");
        System.out.print(arr2[2] + " ");
        System.out.print(arr2[3] + " ");
        System.out.print(arr2[4] + " ");*/
        
        
        //OTRO EJERCICIO DE LA PRESENTACION
        final int N=15;
        final int M=20;
        double [] v1 = new double[N];
        double [] v2 = new double[M];
        double x = 1.0;
        for(int i=0; i<N; x+=0.2,i++){
            v1[i] = Math.exp(2*x-1);
        }
        for(int i=0; i<M; i++){
            v2[i] = (double) i;
        }
        System.out.print("Valores del Vector 1 \n V1 = {");
        for(int i=0; i<N; i++){
            System.out.print(v1[i]+" ");
        }
        System.out.print("}");
         System.out.print("Valores del Vector 2 \n V2 = {");
        for(int i=0; i<M; i++){
            System.out.print(v2[i]+" ");
        }
        System.out.print("}");
        
        //HACIENDO LA COPIA
        System.arraycopy(v1, (N-1)-10+1, v2, 10, 10);
        System.out.println("\n=======================================================================================================");
        System.out.println("===================================IMPRIMIENDO NUEVAMENTE LOS ARREGLOS==================================");
         System.out.println("\n=======================================================================================================");
        System.out.print("Valores del Vector 1 \n V1 = {");
        for(int i=0; i<N; i++){
            System.out.print(v1[i]+" ");
        }
        System.out.print("}");
         System.out.print("Valores del Vector 2 \n V2 = {");
        for(int i=0; i<M; i++){
            System.out.print(v2[i]+" ");
        }
        System.out.print("}");
  }

}
