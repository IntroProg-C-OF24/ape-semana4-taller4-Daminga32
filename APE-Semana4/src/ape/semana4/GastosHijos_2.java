package ape.semana4;

import java.util.Scanner;

public class GastosHijos_2 {

    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los gastos del primer hijo: ");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingrese los gastos del segundo hijo: ");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo: ");
        gastosHijo3 = teclado.nextDouble();
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("Los gastos totales de sus hijos fueron: " + gastosTotales);
    }

}
