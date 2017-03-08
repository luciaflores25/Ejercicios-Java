/* Nombre: Lucía Flores Padilla
 * Fecha: 8 de marzo de 2017
 * Ejercicio 12 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio12 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		int primerNum = 0;
		int segundoNum = 1;
		int ayuda;
		
		System.out.println("Introduce la cantidad de números de la serie de Fibonacci que quieres que se muestren: ");
		n = s.nextInt();
		
		if (n == 1){
			
			System.out.print("0");
		}else if(n == 2){
			
			System.out.print("0 1");
		}else {
			System.out.print("0 1");
			primerNum = 0;
			segundoNum = 1;
			
			while(n > 2) {
            ayuda = primerNum;
			primerNum = segundoNum;
            segundoNum = ayuda + segundoNum;
            System.out.print(" " + segundoNum);
            n--;
            
			}//cierra while
			
		}//cierra if
		
	}//Cierra el public static
	
}//Cierra el public class
