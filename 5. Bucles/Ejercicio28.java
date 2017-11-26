/**
 * Programación
 * Tema 5 Bucles
 * 26 de noviembre de 2017
 * Ejercicio 28
 * 
 * 28. Escribe un programa que calcule el factorial de un número entero leído por
       teclado.
        Ejemplo:
        Por favor, introduzca un número entero: 6
        6! = 720
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un número (entero y positivo) y te dire su factorial: ");
    int n = Integer.parseInt(s.nextLine());
    
    int factorial = 1;
    
    for (int i = 1; i <= n; i++){ //realiza el factorial
      factorial *= i;
    }
    System.out.println("El factorial de " + n + " es " + factorial);
  }
}
