/*
Algoritmo-8
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ape.semana4;

import java.util.Scanner;

public class ServiciosDigitales_8 {

    public static void main(String[] args) {
        double costoNetflix;
        double costoYoutube;
        double costoDropbox;
        double costoSpotify;
        double costoTotal;
        int edad;
        double descuento;
        descuento = (0.2);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad:  ");
        edad = teclado.nextInt();
        System.out.println("Ingrese cuanto paga mensualmente por Netflix:  ");
        costoNetflix = teclado.nextDouble();
        System.out.println("Ingrese cuanto paga mensualmente por Youtube Premium:  ");
        costoYoutube = teclado.nextDouble();
        System.out.println("Ingrese cuanto paga mensualmente por Dropbox:  ");
        costoDropbox = teclado.nextDouble();
        System.out.println("Ingrese cuanto paga mensualmente por Spotify premium:  ");
        costoSpotify = teclado.nextDouble();
        if (edad < 30) {
            costoTotal = (costoDropbox + costoNetflix + costoSpotify + costoYoutube) * descuento;
        } else {
            costoTotal = (costoDropbox + costoNetflix + costoSpotify + costoYoutube);
        }
        System.out.println("El costo total de todas las plataformas digitales en uso es de: "+costoTotal);
    }

}
