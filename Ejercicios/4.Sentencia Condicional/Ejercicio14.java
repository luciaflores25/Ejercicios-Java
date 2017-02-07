/* Nombre: Lucía Flores Padilla
 * Fecha: 7 de febrero de 2017
 * Ejercicio 14 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio14 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		double x;
		 System.out.print("Vamos a introducir un número por teclado para saber si es par o impar y/o divisible entre 5: ");
		 x = s.nextDouble();
    
    if (x%2 == 0) {
      System.out.println("El número es par");
      } else {
       System.out.println("El número es impar");
       }
  
    if (x%5 == 0) {
      System.out.println("El número es divisible entre 5");
      } else {
      System.out.println("El número no es divisible entre 5");
       }
	}//Cierra el public static
	
}//Cierra el public class
