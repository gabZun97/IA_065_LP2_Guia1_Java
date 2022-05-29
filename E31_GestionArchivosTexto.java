package EjerciciosLenguajeII_1400;

import java.io.BufferedReader;
import java.io.BufferedWriter; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner;
public class E31_GestionArchivosTexto { 
    public static void main(String[] args) throws IOException { 
        try {
                //creando un archivo de texto
                String ruta = "C:/Users/Owner/Documents/NetBeansProjects/LenguajeII_1400_IPA2022/LenguajeII_1400_2022/src/EjerciciosLenguajeII_1400/prueba.txt"; 
                File archivo = new File(ruta); 
                BufferedWriter bw; 


                if(archivo.exists()) { 
                    bw = new BufferedWriter(new FileWriter(archivo)); 
                    bw.write("El fichero de texto ya estaba creado."); 
                    bw.append("\nfgdfgfd");

                } else { 
                    bw = new BufferedWriter(new FileWriter(archivo)); 
                    bw.write("Acabo de crear el fichero de texto."); 
                    bw.append("\ndfgdfgdfg");
                } 
                bw.close(); 

                //leyendo un archivo de texto
                File doc = new File(ruta);
                Scanner obj = new Scanner(doc);

                while (obj.hasNextLine()){
                    //linea leida
                    System.out.println(obj.nextLine());                    
                }     
              /*          
                //comparando 
                 String nombreFichero = ruta;
                 //texto a comparar
                 String lineaAComparar = "El fichero de texto ya estaba creado.";
               //Declarar una variable BufferedReader
                BufferedReader br = null;
                try {
                   //Crear un objeto BufferedReader al que se le pasa 
                   //   un objeto FileReader con el nombre del fichero
                   br = new BufferedReader(new FileReader(ruta));
                   //Leer la primera línea, guardando en un String
                   String texto = br.readLine();
                   //Repetir mientras no se llegue al final del fichero
                   while(texto != null){
                       //Hacer lo que sea con la línea leída
                       //System.out.println(texto);
                       //comparar por ejemplo
                       if(texto.equalsIgnoreCase(lineaAComparar)){
                           System.out.println("La linea existe");
                       }
                       //Leer la siguiente línea
                       texto = br.readLine();
                   }
                }catch (FileNotFoundException e) {
                    System.out.println("Error: Fichero no encontrado");
                    System.out.println(e.getMessage());
                }catch(Exception e) {
                    System.out.println("Error de lectura del fichero");
                    System.out.println(e.getMessage());
                }finally {
                    try {
                        if(br != null)
                            br.close();
                    }
                    catch (Exception e) {
                        System.out.println("Error al cerrar el fichero");
                        System.out.println(e.getMessage());
                    }
                }*/
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        //EJEMPLO DE TRADUCCION DEL PROYECTO 
        Scanner in = new Scanner(System.in);
        System.out.println("Seleccione el idioma\n1.Español\n2.Ingles");
        int idioma = in.nextInt();
        imprimirMenu(idioma);
       
    } 
    public static void imprimirMenu(int idioma) throws FileNotFoundException, IOException{
        if(idioma == 1){ //llamo al archivo en español
            String ruta = "C:/Users/Owner/Documents/NetBeansProjects/LenguajeII_1400_IPA2022/LenguajeII_1400_2022/src/EjerciciosLenguajeII_1400/espanol.txt";
            BufferedReader br = null;
            br = new BufferedReader(new FileReader(ruta));
            //Leer la primera línea, guardando en un String
            String texto = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            //Hacer lo que sea con la línea leída comparar por ejemplo   
            String linea = texto.trim().toLowerCase().substring(0,4);
            while(linea.equalsIgnoreCase("menu")){
                System.out.println(texto.substring(4));
                //Leer la siguiente línea
                texto = br.readLine();
                linea = texto.trim().toLowerCase().substring(0,4);
            }
            br.close();
        }else{ //llamo al archivo en ingles 
            String ruta = "C:/Users/Owner/Documents/NetBeansProjects/LenguajeII_1400_IPA2022/LenguajeII_1400_2022/src/EjerciciosLenguajeII_1400/ingles.txt";
            BufferedReader br = null;
            br = new BufferedReader(new FileReader(ruta));
            //Leer la primera línea, guardando en un String
            String texto = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            //Hacer lo que sea con la línea leída comparar por ejemplo  
            while(texto != null){
                //validar que exceda el numero minimo de caracteres a comparar
                if(texto.trim().length() > 5){
                    String linea = texto.trim().toLowerCase().substring(0,5);
                    while(linea.equalsIgnoreCase("carta")){
                        System.out.println(texto.substring(5));
                        //Leer la siguiente línea
                        texto = br.readLine();
                        //setear la siguiente linea
                        linea = texto.trim().toLowerCase().substring(0,5);
                    }
                }else{
                    System.out.println(texto.length());
                }
                
            } 
            br.close();
        }
        
    }
}