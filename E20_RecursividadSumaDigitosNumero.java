/*
 * Sumar los digitos de un numero de forma recursiva
*/
package EjerciciosLenguajeII_1400;


public class E20_RecursividadSumaDigitosNumero {
    public static void main(String[] args) {
        int num = 56789;
        System.out.println("La suma es: "+suma(num));
    }
    public static int suma(int numero){
        if(numero < 10){ //caso base
            return numero; //ya es de una cifra entonces lo devolvemos
        }else{
            return (numero%10) + suma(numero/10);
        }
    }
}
