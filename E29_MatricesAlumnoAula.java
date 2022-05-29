/*
 * Registrar 10 estudiantes y cada uno de ellos recibe clases en al menos 3 aulas 
 * indicar con el numero de registro del estudiante a que aulas esta asignado.
 */
package EjerciciosLenguajeII_1400;

import java.io.IOException;
import java.util.*;
public class E29_MatricesAlumnoAula {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        String [][]estudiantes = new String[10][4];
        char s= 's';
        int opcion;
        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1.Registrar Aulas de Estudiantes\n2.Buscar estudiante ");
            opcion = in.nextInt();
            switch(opcion){
                case 1:
                    registrarEstudiante(estudiantes);
                    break;
                case 2:
                    buscarEstudiante(estudiantes);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("Desea continuar? s=si / n=no: ");
            s = (char) System.in.read();
        }while(s=='s');
    }
    public static void registrarEstudiante(String a[][]){
        in.nextLine();
        for(int i=0; i< a.length;i++){
            System.out.println("Ingrese el registro del estudiante "+(i+1)+": ");
            a[i][0] = in.nextLine();
            for(int j=1; j<a[i].length;j++){
                System.out.println("Ingrese el aula "+j+" donde recibe clases este estudiante: ");
                a[i][j] = in.nextLine();
            }
        }
        
        //imprimirla 
        for(int i=0; i< a.length;i++){
            System.out.println("Registro: "+a[i][0]);
            for(int j=1; j<a[i].length;j++){
                System.out.println("\tAula "+j+": "+a[i][j]);
            }
        }
    }
    public static void buscarEstudiante(String a[][]){
           in.nextLine();
        String registro="";
        System.out.println("Ingrese el registro del estudiante: ");
        registro = in.nextLine();
        for(int i=0; i< a.length;i++){
            if(a[i][0].equalsIgnoreCase(registro)){
                System.out.println("Aulas en las que esta asignado: ");
                for(int j=1; j<a[i].length;j++){                    
                    System.out.println("Aula "+j+": "+a[i][j]);
                }
            }            
        }
    }
}
