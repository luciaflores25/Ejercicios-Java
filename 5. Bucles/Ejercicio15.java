/**
 * Programación
 * Tema 5 Bucles
 * 3 de noviembre de 2017
 * Ejercicio 15
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
  positivo (exponente), saque por pantalla todas las potencias con base el
  numero dado y exponentes entre uno y el exponente introducido. No se deben
  utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
  se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5...

 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa calcula la potencia de un número.");
    System.out.println("Introduce el número: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.println("Introduce el exponente (entero positivo): ");
    int exponente = Integer.parseInt(s.nextLine());
    
    int i = 1;
    
    while(i <= exponente) {
      double potencia = Math.pow(base,i);
      System.out.println(base + "^" + i + " = " + potencia);
      i++;
    }
  }
}
