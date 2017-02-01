/* Nombre: Lucía Flores Padilla
 * Fecha: 1 de febrero de 2017
 * Ejercicio 1 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio01 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		String dia;
		
		System.out.println("Introduce un día de la semana (de lunes a viernes) y te diré que asignatura toca a primera hora: ");
		dia = s.next();
		
		switch (dia){
			
			case "lunes": 
				System.out.println("Sistemas Informáticos");
				break;
				
			case "martes": 
				System.out.println("Programación");
				break;
				
			case "miercoles": 
				System.out.println("Programación");
				break;
				
			case "jueves": 
				System.out.println("Bases de Datos");
				break;
				
			case "Viernes": 
				System.out.println("Lenguaje de Marcas");
				break;
				default:
					System.out.println("El día que has introducido no es correcto");

			
		}//Cierra el switch
		
	}//Cierra el public static
	
}//Cierra el public class
