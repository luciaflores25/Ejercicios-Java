/**
 * Programación
 * Tema 5 Bucles
 * 2 de noviembre de 2017
 * Ejercicio 14
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y
  que calcule la potencia.
 *  
 * @author Lucía Flores Padilla
 */
 
import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa calcula la potencia de un número.");
    System.out.println("Introduce el número: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.println("Introduce el exponente (entero positivo): ");
    int exponente = Integer.parseInt(s.nextLine());
    
    System.out.println("La potencia es " + Math.pow(base,exponente));
    
  }
}
