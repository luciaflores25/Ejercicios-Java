/* Nombre: Lucía Flores Padilla
 * Fecha: 13 de marzo de 2017
 * Ejercicio 15 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio15 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int base;
		int exponenteCambiante;
		int exponente;
		int potencia;
		
		System.out.println("Introduce un número positivo o negativo: ");
		base = s.nextInt();
		
		System.out.println("Ahora introduce hasta que exponente quieres que se le aplique la potencia al número base anteriormente introducido: ");
		exponente = s.nextInt();
		
		for(int i = 1; i <= exponente; i++){
			
			exponenteCambiante = i;
			potencia = 1;
			
			for(int j = 0; j < exponenteCambiante; j++){
				
				potencia = potencia*base;
				
			}//Cierra el segundo for
			
			System.out.println(base + " elevado a " + i + " = " + potencia);
			
		}//Cierra el primer for
		
	}//Cierra el public static
	
}//Cierra el public class
