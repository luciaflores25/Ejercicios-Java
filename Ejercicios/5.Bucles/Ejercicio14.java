/* Nombre: Lucía Flores Padilla
 * Fecha: 13 de marzo de 2017
 * Ejercicio 14 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio14 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int base = 0;
		int exponente = 0;
		int potencia = 1;
		
		System.out.println("Introduce un numero y su exponente y te diré cual es la potencia.");
		System.out.println("Introduce la base del numero:");
		base = s.nextInt();
		
		System.out.println("Ahora introduce el exponente: ");
		exponente = s.nextInt();
		
		for(int i = 0; i < exponente; i++){
			
			potencia = potencia*base;
			
		}//Cierra el for
		
		System.out.println("La potencia es: " + base + " elevado a " + exponente + " y su resultado da " + potencia);
		
	}//Cierra el public static
	
}//Cierra el public class
