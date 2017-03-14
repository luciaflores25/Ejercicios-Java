/* Nombre: Lucía Flores Padilla
 * Fecha: 14 de marzo de 2017
 * Ejercicio 17 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio17 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero;
		boolean esCorrecto = true;
		int suma = 0;
		
		
		do {
		System.out.println("Introduce un número positivo y le sumaré los 100 siguientes: ");
		numero = s.nextInt();
      
      if(numero < 0) {
        System.out.println("El número introducido no es positivo.");
      }//Cierra el if
    } while (numero < 0);
    
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }//Cierra el for

    System.out.println("La suma de los 100 números siguientes a " + numero + " es " + suma);
		
	}//Cierra el public static
	
}//Cierra el public class
