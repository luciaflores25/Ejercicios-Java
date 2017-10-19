/**
 * Programación
 * Tema 4 Senttencia condicional (if y switch)
 * Ejercicio 6
 * 18 de octubre de 2017
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un 
   objeto desde una altura h.
   t = raiz(2h/g) siendo g = 9.81 m/s2
 * 
 * @author Lucía Flores Padilla
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    
    System.out.print("Este programa calcula el tiempo que tardará en caer ");
    System.out.println("un objeto desde una altura:");
    System.out.print("Introduce la altura desde la que quieres qe caiga el objeto (m):  ");
    double h = Double.parseDouble(System.console().readLine());
    
    
    
    if (h > 0) {
      final double g = 9.81;
      double t = Math.sqrt((2*h)/g);
      System.out.printf("\nEl objeto desde " + h + " metros, tardará en caer %.2f segundos", t);
    } else {
     System.out.println("La altura debe ser mayor que 0");
    }
  }
}
