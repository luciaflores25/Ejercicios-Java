/* Nombre: Lucía Flores Padilla
 * Fecha: 1 de febrero de 2017
 * Ejercicio 7 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio07 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		
		
		System.out.println("Este programa calcula la media de tres notas introducidas por teclado");
		System.out.println("Introduce la primera nota: ");
		double primeraNota = s.nextDouble();
		
		System.out.println("Aquí la segunda: ");
		double segundaNota = s.nextDouble();
		
		System.out.println("Y aquí la tercera: ");
		double terceraNota = s.nextDouble();
		
		double media = (primeraNota + segundaNota + terceraNota) / 3;
		
		System.out.println("La media de las 3 notas introducidas es " + media);
		
		
	}//Cierra el public static
	
}//Cierra el public class
