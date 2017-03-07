/* Nombre: Lucía Flores Padilla
 * Fecha: 7 de marzo de 2017
 * Ejercicio 9 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio09 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero;
		System.out.println("Introduce un número por favor, y te diré cuantos dígitos tiene: ");
		numero = s.nextInt();
		
		int ayuda = numero;
		int contador = 0;
		
		while (ayuda > 0){
			
			ayuda = ayuda/10;
			contador++;
			
		}//Cierra el while
		
		System.out.println("El número que has introducido tiene " + contador + " dígitos.");
		
	}//Cierra el public static
	
}//Cierra el public class
