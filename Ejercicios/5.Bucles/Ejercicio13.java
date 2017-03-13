/* Nombre: Lucía Flores Padilla
 * Fecha: 13 de marzo de 2017
 * Ejercicio 13 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio13 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int positivos = 0;
		int negativos = 0;
		int numero;
		
		for(int i=0;i<11;i++){
		
		System.out.println("Introduce un número, puede ser positivo o negativo: ");
		numero = s.nextInt();
		
		if(numero > 0){
			positivos++;
		}else if(numero < 0){
			negativos++;
		}
	}
		
		System.out.println("Se han introducido " + positivos + " números positivos y " + negativos + " números negativos.");
		
	}//Cierra el public static
	
}//Cierra el public class
