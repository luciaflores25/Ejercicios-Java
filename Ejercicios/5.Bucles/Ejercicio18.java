/* Nombre: Lucía Flores Padilla
 * Fecha: 15 de marzo de 2017
 * Ejercicio 18 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio18 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int primerNumero, segundoNumero;
		
		System.out.println("Introduce un número: ");
		primerNumero = s.nextInt();
		
		System.out.println("Ahora introduce otro número mayor que el anterior: ");
		segundoNumero = s.nextInt();
		
		System.out.println("Los números que están comprendidos entre estos dos números de 7 en 7 son :");
		
		int mayor, menor;
		
		if(primerNumero > segundoNumero){
			
			menor = segundoNumero;
			mayor = primerNumero;
			
		}else {
			menor = primerNumero;
			mayor = segundoNumero;
			
		}//Cierra el if
		for(int i = menor; i <= mayor; i+=7){
			
			System.out.print(i);
			
			 if (mayor - 7 >= i) {
				 
				 System.out.print(", ");
				 
			 }//Cierra el if
			
		}//Cierra el for
		
	}//Cierra el public static
	
}//Cierra el public class
