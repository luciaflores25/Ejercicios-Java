/* Nombre: Lucía Flores Padilla
 * Fecha: 9 de febrero de 2017
 * Ejercicio 19 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio19 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int numero;
		System.out.println("Introduce un número de 5 o menos dígitos (positivo o negativo) y te diré cuantos dígitos tiene");
		numero= s.nextInt();
		
		if (numero < 10 && numero >-10){
			System.out.println("El número que se a introducido tiene 1 dígito");
		}
		else if ((numero >= 10 && numero < 100) || (numero <= -10 && numero > -100)){
			System.out.println("El número que se ha introducido tiene 2 dígitos");
		}
		else if ((numero >= 100 && numero < 1000) || (numero <= -100 && numero > -1000)){
			System.out.println("El número que se ha introducido tiene 3 dígitos");
		}
		else if ((numero >= 1000 && numero < 10000) || (numero <= -1000 && numero > -10000)){
			System.out.println("El número que se ha introducido tiene 4 dígitos");
		}
		else if ((numero >= 10000 && numero < 100000) || (numero <= -1000 && numero > -100000)){
			System.out.println("El número que se ha introducido tiene 5 dígitos");
		}else{
			System.out.println("El número que has introducido tiene más de 5 dígitos.");
		}
		
		
	}//Cierra el public static
	
}//Cierra el public class
