/* Nombre: Lucía Flores Padilla
 * Fecha: 2 de febrero de 2017
 * Ejercicio 8 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio08 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		
		
		System.out.println("Este programa calcula la media de tres notas introducidas por teclado");
		System.out.println("Introduce la primera nota: ");
		double primeraNota = s.nextDouble();
		
		System.out.println("Aquí la segunda: ");
		double segundaNota = s.nextDouble();
		
		System.out.println("Y aquí la tercera: ");
		double terceraNota = s.nextDouble();
		
		double media = (primeraNota + segundaNota + terceraNota) / 3;
		
		System.out.println("La media de las 3 notas introducidas es " + media);
		
		if((media >= 5) && (media < 6)){
			System.out.println("Has aprobado, tienes un suficiente en la nota del trimestre!!");
		}
		
		if ((media >=7) && (media <9)){
			System.out.println("Enorabuena, tienes un notable en la nota del trimestre!!");
		}
		
		if ((media >=9) && (media < 11)){
			System.out.println("Felicidades, tienes un sobresaliente en la nota del trimestre!!");
		}
		
		if ((media >= 0) && (media < 5)){
			System.out.println("Lo siento, tienes insuficiente en la nota del trimestre..");
		}
		
	}//Cierra el public static
	
}//Cierra el public class
