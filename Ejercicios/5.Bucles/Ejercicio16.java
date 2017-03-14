/* Nombre: Lucía Flores Padilla
 * Fecha: 14 de marzo de 2017
 * Ejercicio 16 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio16 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero;
		boolean primo = true;
		
		System.out.println("Introduce un número y te diré si es primo o no");
		numero = s.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if ((numero % i) == 0) {
				primo = false;
				
				}//cierra el if
			
		}//Cierra el for
      
		if(primo){
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
			
		}//Cierra el if
		
	}//Cierra el public static
	
}//Cierra el public class
