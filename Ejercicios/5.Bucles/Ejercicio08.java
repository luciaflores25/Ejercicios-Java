/* Nombre: Lucía Flores Padilla
 * Fecha: 20 de febrero de 2017
 * Ejercicio 8 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio08 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduce un número y se mostrará la tabla de multiplicar: ");
		n = s.nextInt();
		
		for (int i = 0; i <= 10; i++){
			System.out.println(n + " x " + i + " = " + n * i );
		}
		
	}//Cierra el public static
	
}//Cierra el public class
