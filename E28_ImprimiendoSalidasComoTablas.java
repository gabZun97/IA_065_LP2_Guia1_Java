/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLenguajeII_1400;

public class E28_ImprimiendoSalidasComoTablas {
    public static void main(String[] args) {
        String formato = "| %-24s | %-4d |  %-4d  |  %-6d  |%n"; //FORMATO

        System.out.format("+--------------------------+------+--------+----------+%n");
        System.out.format("| nombre de la columna     | I^2  |   I^3  |    I^4   |%n");
        System.out.format("+--------------------------+------+--------+----------+%n");
        for (int i = 1; i <= 10; i++) {
            System.out.format(formato, "Datos" + i, i * i,(i*i*i),(i*i*i*i));
        }
        System.out.format("+--------------------------+------+--------+----------+%n");
    }
}
