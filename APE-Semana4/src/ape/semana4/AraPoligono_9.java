/*
* Algoritmo-9
El programa debe calcular el área del polígono. 
La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura mide lo mismo que la altura de los triángulos. 
Se pide que haga un programa que calcule el área total.
 */
package ape.semana4;
import java.util.Scanner;
public class AraPoligono_9 {
    public static void main(String[] args) {
        double baseCuadrado;
        double alturaTriangulo;
        double areaPoligono;
        double areasTriangulos;
        double areaCuadrado;
        double areaRectangulo;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la altura de uno de los triangulos: ");
        alturaTriangulo = teclado.nextDouble();
        System.out.println("Ingrese la base del cuadrado:  ");
        baseCuadrado= teclado.nextDouble();
        areasTriangulos=((baseCuadrado*alturaTriangulo)/2)*3;
        areaCuadrado=baseCuadrado*baseCuadrado*baseCuadrado*baseCuadrado;
        areaRectangulo=(baseCuadrado*alturaTriangulo)/2;
        areaPoligono=areasTriangulos+areaRectangulo+areaCuadrado;
        System.out.println("El area del poligono es de:  "+areaPoligono);
        
        
               
    }
    
}
