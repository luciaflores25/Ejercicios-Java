/* Nombre: Lucía Flores Padilla
 * Fecha: 7 de marzo de 2017
 * Ejercicio 10 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio10 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		double numeroIntroducido = 0;
		double numeros = 0;
		double suma = 0;
		System.out.println("Introduce números enteros por teclado y cuando quieras parar introduce uno negativo: ");
		
		while(numeroIntroducido >= 0) {
			
			numeroIntroducido = s.nextDouble();
			numeros ++;
			suma += numeroIntroducido;
	
		}//Cierra el while
		
		System.out.println("La suma de los números que has introducido es " + suma);
		
	}//Cierra el public static
	
}//Cierra el public class
