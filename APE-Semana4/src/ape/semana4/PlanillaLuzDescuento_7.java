/*
 *Algoritmo-7
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ape.semana4;
import java.util.Scanner;
public class PlanillaLuzDescuento_7 {
    public static void main(String[] args) {
        double costoKiloHora;
        double numKiloMes;
        double valorCancelar;
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad:  "  );
        edad = teclado.nextInt();
        System.out.println("Ingrese el valor del cosoto kilovatio por hora: ");
        costoKiloHora= teclado.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos en el mes:  ");
        numKiloMes=teclado.nextDouble();
        valorCancelar=costoKiloHora*numKiloMes;
        System.out.println("El costo de la planilla del mes sin descuento es de: "+valorCancelar);
        System.out.println("El costo de la planilla del mes con descuento por mayor de edad  es de:   "+((valorCancelar*10)/100));    
            
            
    }
    
}
