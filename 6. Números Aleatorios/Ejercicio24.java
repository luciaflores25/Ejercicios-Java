/**
 * Programación
 * Tema 6 Números Aleatorios
 * 1 de diciembre de 2017
 * Ejercicio 24
 * 
 * 24. Escribe un programa que, dado un número introducido por teclado, elija al azar
       uno de sus dígitos.
      
       Ejemplo 1:
       Por favor, introduzca un número entero positivo: 406783
       7
       Ejemplo 2:
       Por favor, introduzca un número entero positivo: 406783
       3
       Ejemplo 3:
       Por favor, introduzca un número entero positivo: 406783
       0
 *  
 * @author Lucía Flores Padilla
 */

import java.util.Scanner;
public class Ejercicio24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(s.nextLine());
    
    int n = numero;
    int contador = 0;
    
    while (n > 0) {
      n /= 10;
      contador++;
    }
    int posicion = (int) (Math.random() * contador) + 1;
    
    while (posicion > 1) {
      numero /= 10;
      posicion--;
    }
    System.out.println("La cifra aleatoria es: " + numero % 10);
  }
}
