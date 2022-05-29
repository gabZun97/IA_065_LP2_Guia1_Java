/*
 * Metodos de ordenamiento y busqueda en ARRAY - JAVA
 */
package EjerciciosLenguajeII_1400;

public class E32_ArrayMetodosOrdenamientoBusqueda {
    public static void main(String[] args) {
        System.out.println("\n=======================================================");
        System.out.println("                    Ordenamientos");
        System.out.println("=======================================================");
        //seleccion
        System.out.println("           Selección");
        int [] arreglo = {50,26,7,9,15,27};
        seleccion(arreglo);
        for(int i=0; i<arreglo.length;i++){
            System.out.print(" "+arreglo[i]);
        }
        System.out.println("\n=======================================================");
        System.out.println("           Burbuja");
        //burbuja
        int [] arreglob = {50,26,7,9,15,27,67,6};
        burbuja(arreglob);
        for(int i=0; i<arreglob.length;i++){
            System.out.print(" "+arreglob[i]);
        }
        System.out.println("\n=======================================================");
         System.out.println("           Inserción");
        //insercion 
         int [] arregloi = {50,26,7,9,15,27,67,6,90,2};
         insercion(arregloi);
        for(int i=0; i<arregloi.length;i++){
            System.out.print(" "+arregloi[i]);
        }
        System.out.println("\n=======================================================");
        System.out.println("                       Búsquedas");
        System.out.println("=======================================================");
        System.out.println("          Secuencial");
        //secuencial 
            //primera coincidencia
        int [] arreglo_bs = {50,26,7,9,15,27,9};
        int criterio = 9;
        int posicion = busquedaSecuencial_1(arreglo_bs, criterio);  
        System.out.println("Valores en el arreglo original: ");
        for(int i=0; i<arreglo_bs.length;i++){
            System.out.print(" "+arreglo_bs[i]);            
        }
        System.out.print("\nValor en el arreglo: "+arreglo_bs[posicion]+" \n En la posición: "+posicion);        
        System.out.println("\n=======================================================");
            //ultima coincidencia
        int [] arreglo_bs_uc = {50,26,7,9,15,27,9};
        int criterio_uc = 9;
        int posicion_uc = busquedaSecuencial_u(arreglo_bs_uc, criterio_uc);    
        System.out.println("Valores en el arreglo original: ");
        for(int i=0; i<arreglo_bs_uc.length;i++){
            System.out.print(" "+arreglo_bs_uc[i]);
        }
        System.out.print("\nValor en el arreglo: "+arreglo_bs_uc[posicion_uc]+" \n En la posición: "+posicion_uc);        
        System.out.println("\n=======================================================");
            //todas las coincidencias
        int [] arreglo_bs_t = {50,26,7,9,15,27,9};
        int criterio_t = 9;
        String posicion_t = busquedaSecuencial2(arreglo_bs_t, criterio_t);    
        System.out.println("Valores en el arreglo original: ");
        for(int i=0; i<arreglo_bs_t.length;i++){
            System.out.print(" "+arreglo_bs_t[i]);
        }
        //quitando ultim caracter 
        String str = posicion_t.substring(0, posicion_t.length()-1);
        
        System.out.print("\n Posiciones en el arreglo donde estan los valores "+criterio_t+" : "+str);        
        System.out.println("\n=======================================================");   
        System.out.println("          Binaria");
        int [] arreglo_bb = {50,26,7,9,15,27,9};
        int criterio_bb = 9;
        System.out.println("Valores en el arreglo original: ");
        for(int i=0; i<arreglo_bb.length;i++){
            System.out.print(" "+arreglo_bb[i]);
        }
        System.out.println("");
        boolean resp = buscarBinario(criterio_bb, arreglo_bb);
        
        if(resp){
            System.out.println("El valor buscado existe en el arreglo.");
        }else{
            System.out.println("El valor buscado NO existe en el arreglo.");
        }
    }
    //método java de ordenación por selección
    public static void seleccion(int A[]) {
              int i, j, menor, pos, tmp;
              for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
                    menor = A[i];                       // de los elementos que quedan por ordenar                    
                    pos = i;                            // y guardamos su posición
                    for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                          if (A[j] < menor) {           // del array algún elemento
                              menor = A[j];             // menor que el actual
                              pos = j;
                          }
                    }
                    if (pos != i){                      // si hay alguno menor se intercambia                         
                        tmp = A[i];
                        A[i] = A[pos];
                        A[pos] = tmp;
                    }
              }
    }
    //metodo burbuja 
    public static void burbuja(int []arregloDesordenado){ 
        int n = arregloDesordenado.length;
        for(int i=n; i>1;i--){
            for(int j=0; j<i-1;j++){
                if(arregloDesordenado[j] > arregloDesordenado[j+1]){
                    int temp = arregloDesordenado[j];
                    arregloDesordenado[j] = arregloDesordenado[j+1];
                    arregloDesordenado[j+1] = temp;
                }
            }
        }
    }
    //metodo insercion 
    public static void insercion(int []arregloDesordenado){
        int n = arregloDesordenado.length;
        for(int i=1; i<n;i++){
            for(int j=i; j>0 && arregloDesordenado[j-1] > arregloDesordenado[j];j--){
                int temp = arregloDesordenado[j];
                arregloDesordenado[j] = arregloDesordenado[j-1];
                arregloDesordenado[j-1] = temp;
            }
        }
    }
    
    //BUSQUEDA SECUENCIAL
    //primera coincidencia
    public static int busquedaSecuencial_1(int []arreglo,int dato){
        int posicion = -1;
        for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
            if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
                posicion = i;//Si es verdadero guardamos la posicion
                break;//Para el ciclo
            }
        }
        return posicion;
    }
    //ultima coincidencia 
    public static int busquedaSecuencial_u(int []arreglo,int dato){
        int posicion = -1;
        for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
            if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
                posicion = i;//Si es verdadero guardamos la posicion                
            }
        }
        return posicion;
    }
    //todas las coincidencias (aunque se puede haber utilizado un arrayList, Vector)
    public static String busquedaSecuencial2(int []arreglo,int valor){
        String posicion = "";
         for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == valor){
             posicion += i+",";    
            }
         }
        return posicion;
    }
    //busqueda binaria
    public static boolean buscarBinario(int valor, int [] arreglo){
        boolean encontrado = false;
        int inicio =0, fin = arreglo.length - 1;
        while((inicio <= fin) && (!encontrado)){
            int medio = (inicio + fin)/2;
            if(arreglo[medio] ==valor){
                encontrado = true;
                System.out.println("Valor encontrado: "+arreglo[medio]+" en la posicion : "+medio);
            }else{
                if(arreglo[medio] > valor){
                    fin = medio -1;
                }else{
                    inicio = medio + 1;
                }
            }
            
        }
        return encontrado;
    }
}
