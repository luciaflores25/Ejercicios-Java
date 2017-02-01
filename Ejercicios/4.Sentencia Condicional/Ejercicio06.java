/* Nombre: Lucía Flores Padilla
 * Fecha: 1 de febrero de 2017
 * Ejercicio 6 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio06 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		double a,b;
		
		System.out.println("Este programa resuelve una ecuación de primer grado de tipo: ax + b = 0");
		
		System.out.print("Introduce el valor de a: ");
		a = s.nextDouble();
		
		System.out.print("Y ahora introduce el valor de b: ");
		b = s.nextDouble();

		if (a == 0) {
			System.out.println("La ecuación no tiene solución.");
		
		}else {
			System.out.println("x = " + (-b/a));
		}


	}//Cierra el public static
	
}//Cierra el public class
