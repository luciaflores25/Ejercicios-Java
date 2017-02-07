/* Nombre: Lucía Flores Padilla
 * Fecha: 7 de febrero de 2017
 * Ejercicio 13 Sentencia Condicional
 * Programación
 */
import java.util.Scanner;
public class Ejercicio13 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int a, b, c;
    
    System.out.print("Vamos a ordenar de menor a mayor 3 números que introduciremos a continuacion por teclado. ");
    System.out.print("Introduce el primer número: ");
    a = s.nextInt();
    
    System.out.print("Ahora introduce el segundo número: ");
    b = s.nextInt();
    
    System.out.print("Y por último el tercer número: ");
    c = s.nextInt();
    
    if (a<b && a<c) {
      if (b<c) {
        System.out.print( a + " < " + b + " < " + c);
      } else {
        System.out.print( a + " < " + c + " < " + b);
      }  
      
       } else if(b<a && b<c) {
        if (a<c) {
         System.out.print( b + " < " + a + " < " + c);
        } else {
          System.out.print( b + " < " + c + " < " + a);
        }  
       } else if(c<a && c<b) {
        if (a<b) {
         System.out.print( c + " < " + a + " < " + b);
        } else {
          System.out.print( c + " < " + b + " < " + a);
         }
      }
		
	}//Cierra el public static
	
}//Cierra el public class
