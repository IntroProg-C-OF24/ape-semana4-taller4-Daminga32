package ape.semana4;

import java.util.Scanner;

public class PagoMensualPrestamo_6 {

    public static void main(String[] args) {
        double montoPrestamo;
        double interesMensual;
        double totalCosto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto del prestamo pedido: ");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingrese el interes mensual del prestamo: ");
        interesMensual = teclado.nextDouble();
        totalCosto = (interesMensual * montoPrestamo) / ( (1 + interesMensual) - 12);
        System.out.println("El pago mensual seria de: " + totalCosto);

    }

}
