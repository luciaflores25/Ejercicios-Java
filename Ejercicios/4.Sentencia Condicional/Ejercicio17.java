/* Nombre: Lucía Flores Padilla
 * Fecha: 9 de febrero de 2017
 * Ejercicio 17 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio17 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int numero;
	 System.out.println("Introduce un número y te diré cuál es el útimo dígito: ");
	 numero = s.nextInt();
	 
		System.out.println("El último dígito del número es " + (numero%10));
	 
	}//Cierra el public static
	
}//Cierra el public class
