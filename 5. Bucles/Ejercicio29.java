/**
 * Programación
 * Tema 5 Bucles
 * 26 de noviembre de 2017
 * Ejercicio 29
 * 
 * 29. Escribe un programa que muestre por pantalla todos los números enteros
       positivos menores a uno leído por teclado que no sean divisibles entre otro
       también leído de igual forma.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número (entero y positivo) que sea grande: ");
    int n = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce ahora un número (entero positivo) pequeño de 1 ó 2 cifras: ");
    int numeroPeque = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < n; i++) {
      if ((i % numeroPeque) != 0) {
        System.out.print(i + "  ");
      }
    }
  }
}
