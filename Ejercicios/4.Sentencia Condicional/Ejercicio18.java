/* Nombre: Lucía Flores Padilla
 * Fecha: 9 de febrero de 2017
 * Ejercicio 18 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio18 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int numero;
		System.out.println("Introduce un número que tenga 5 dígitos o menos: ");
		numero = s.nextInt();
		
		if(numero <10){
			System.out.println("La primera cifra del número es " + numero);
		} else if (numero <100){
			System.out.println("La primera cifra del número es " + (numero / 10));
			
		} else if (numero <1000){
			System.out.println("La primera cifra del número es " + (numero / 100));
			
		} else if (numero <10000){
			System.out.println("La primera cifra del número es " + (numero / 1000));
			
		} else if (numero <100000){
			System.out.println("La primera cifra del número es " + (numero / 10000));
		}
		
	}//Cierra el public static
	
}//Cierra el public class
