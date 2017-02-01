/* Nombre: Lucía Flores Padilla
 * Fecha: 1 de febrero de 2017
 * Ejercicio 6 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio06 {
	public static void main (String[] args) {
		Scanner es = new Scanner (System.in);
		
		double g = 9.81;

    System.out.println("Tiempo que tarda un objeto en caer.");
    System.out.print("Introduzca la altura (en metros) desde la que cae el objeto: ");
    double h = es.nextDouble();

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);

	}//Cierra el public static
	
}//Cierra el public class
