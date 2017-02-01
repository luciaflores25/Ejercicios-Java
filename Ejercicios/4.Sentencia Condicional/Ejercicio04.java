/* Nombre: Lucía Flores Padilla
 * Fecha: 1 de febrero de 2017
 * Ejercicio 4 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio04 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int sueldo, horas;

		System.out.print("Introduzca el número de horas que ha trabajado durante la semana: ");
		horas = s.nextInt();
    
		if (horas < 40) {
		sueldo = 12 * horas;
		} else {
      sueldo = (40 * 12) + ((horas - 40) * 16);    
		}
	System.out.println("El sueldo semanal es de " + sueldo + " euros");


	}//Cierra el public static
	
}//Cierra el public class
