package ape.semana4;
import java.util.Scanner;
public class PlanillaTelefono_4 {
    public static void main(String[] args) {
        double costoMin;
        double numMin;
        double Total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo por minuto de las llamadas: ");
        costoMin = teclado.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos en elmes: ");
        numMin =teclado.nextDouble();
        Total = costoMin * numMin;
        System.out.println("El costo total mensual va a ser de:  "+Total);
    }
 
}
