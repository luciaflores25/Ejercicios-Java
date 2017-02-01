/* Nombre: Lucía Flores Padilla
 * Fecha: 1 de febrero de 2017
 * Ejercicio 3 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio03 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int dia;
		
		System.out.println("Introduce un número (1-7) y te diré a que día de la semana corresponde: ");
		dia = s.nextInt();
		
		switch (dia){
			
			case 1: 
				System.out.println("Lunes");
				break;
				
			case 2: 
				System.out.println("Martes");
				break;
				
			case 3: 
				System.out.println("Miércoles");
				break;
				
			case 4: 
				System.out.println("Jueves");
				break;
				
			case 5: 
				System.out.println("Viernes");
				break;
				
			case 6: 
				System.out.println("Sábado");
				break;
				
			case 7: 
				System.out.println("Domingo");
				break;
				default:
					System.out.println("El número que has introducido no es correcto");

			
		}//Cierra el switch
		
	}//Cierra el public static
	
}//Cierra el public class
