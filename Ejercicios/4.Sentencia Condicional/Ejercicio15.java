/* Nombre: Lucía Flores Padilla
 * Fecha: 7 de febrero de 2017
 * Ejercicio 15 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio15 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
	System.out.println("Vamos a contruir una pirámide rellena");
    System.out.println("Introduce uno de estos caracteres (*, +, -, $, &..etc para formar la piramide");
    String x = s.next();
    
    System.out.println("\nElige el modelo de la piramide\n");
		System.out.println("1)  vértice hacia arriba");
		System.out.println("2)  vértice hacia abajo");
		System.out.println("3)  vértice hacia la izquierda");
		System.out.println("4)  vértice hacia la derecha");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println("   " + x );
        System.out.println("  " + x + x + x);
        System.out.println(" " + x + x + x+ x + x);
        System.out.println(x + x + x + x + x + x + x);
        break;
			case 2:
        System.out.println(x + x + x + x + x + x);
        System.out.println(" " + x + x + x + x);
        System.out.println("  " + x + x);
        System.out.println("   " + x);
        break;
			case 3:
        System.out.println("    " + x);
        System.out.println("  " + x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println("  " + x + " " + x);
        System.out.println("    " + x);
        break;
			case 4:
        System.out.println(x);
        System.out.println(x + " " + x);
        System.out.println(x + " " + x + " " + x);
        System.out.println(x + " " + x);
        System.out.println(x);
        break;
      default:
		}	}//Cierra el public static
	
}//Cierra el public class
