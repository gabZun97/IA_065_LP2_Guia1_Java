/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E38_POO_MainEstudiante{
    public static void main(String[] args) {
        //instanciar objeto estudiante 
        E38_POO_Estudiante estudiante = new E38_POO_Estudiante("Maria","20151002568","Informática Administrativa",4,90.8);
        E38_POO_Estudiante estudiante1 = new E38_POO_Estudiante("Juan","20181023456","Informática Administrativa",3,70.4);
        
        estudiante.mostrar();
        estudiante1.mostrar();
        try {
            estudiante = null; //destruyendo un objeto
            System.gc();//recolector de basura 
            System.out.println("Nombre: "+estudiante.getNombre());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        estudiante = new E38_POO_Estudiante("Karla","123456789","Informática Administrativa",5,98.8);
        System.gc(); 
        System.out.println(estudiante.getNombre());
        
    }
}
