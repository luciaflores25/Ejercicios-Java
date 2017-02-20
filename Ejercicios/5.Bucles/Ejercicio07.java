/* Nombre: Lucía Flores Padilla
 * Fecha: 19 de febrero de 2017
 * Ejercicio 7 bucles
 * Programación
 */
import java.util.Scanner;
public class Ejercicio07 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
   int intentos = 0;
   int clave;
   boolean acierto = false;
    
    do {
      
      System.out.print("Introduce la clave para desbloqear la caja fuerte (4 cifras): ");
      clave = s.nextInt();
      
          
      if (clave == 1997) {
        acierto = true;
      } else {
        System.out.println("Lo sienteo, esa no es la combinación.");
      }
        
        intentos++;
        
        } while ((intentos < 4) && (!acierto));
       
        if (acierto) {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
    } else {
      System.out.println("Ya no quedan intentos, la caja fuerte se ha bloqueado.");
        
    }
		
	}//Cierra el public static
	
}//Cierra el public class
