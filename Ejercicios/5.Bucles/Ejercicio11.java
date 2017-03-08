/* Nombre: Lucía Flores Padilla
 * Fecha: 8 de marzo de 2017
 * Ejercicio 11 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio11 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número y te dire su cuadrado y su cubo: ");
		numero = s.nextInt();
		
		for(int i = numero; i < numero + 5; i++){
			
			System.out.println(i + "     "+ i*i + "    " + i*i*i);
			
			
		}//Cierra el for
		
	}//Cierra el public static
	
}//Cierra el public class
