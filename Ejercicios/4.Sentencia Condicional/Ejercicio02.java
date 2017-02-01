/* Nombre: Lucía Flores Padilla
 * Fecha: 1 de febrero de 2017
 * Ejercicio 2 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio02 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int hora;
		System.out.println("Introduce una hora del día de 0 a 23:");
		hora = s.nextInt();
		
		if ((hora >= 6) && (hora <= 12)){
			System.out.println("¡Buenos días!");
		}
		
		if ((hora >= 13) && (hora <= 20)){
			System.out.println("¡Buenas tardes!");
		}
		
		if ((hora >= 21) && (hora < 24)){
			System.out.println("¡Buenas noches!");
		}
		
		if ((hora >= 0) && (hora <= 5)){
			System.out.println("¡Buenas noches!");
		}
		
		if ((hora >= 24) || (hora < 0)){
			System.out.println("¡La hora que has introducido no es correcta!");
		}
		
	}//Cierra el public static
	
}//Cierra el public class
