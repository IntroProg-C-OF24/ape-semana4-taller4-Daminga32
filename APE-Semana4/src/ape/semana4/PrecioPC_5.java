/**
 * Algoritmo-5
 * Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio.
 * La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 */
package ape.semana4;

import java.util.Scanner;

public class PrecioPC_5 {

    public static void main(String[] args) {
        double costoCPU, costoTeclado, costoPantalla, costoRaton, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el costo del teclado: ");
        costoTeclado = teclado.nextDouble();
        System.out.println("Ingresar el costo del raton: ");
        costoRaton = teclado.nextDouble();
        System.out.println("Ingresar el costo del CPU: ");
        costoCPU = teclado.nextDouble();
        System.out.println("Ingresar el costo de la pantalla: ");
        costoPantalla = teclado.nextDouble();
        costoTotal = costoCPU + costoPantalla + costoRaton + costoTeclado;
        System.out.println("El costo total de la computadora sera de:  " + costoTotal);

    }

}
